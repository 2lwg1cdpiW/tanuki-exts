package org.tanukis.tanuki.parsers.site.en

import kotlinx.coroutines.runBlocking
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.config.MangaSourceConfig
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaSource
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.network.WebClient
import java.util.*

class AsuraScansParserTest {

    private val fixtureHtml = """
        <html><head></head><body>
        <script>
        window.__COMMENTS = {"comments":[{"id":123,"author":"Alice","content":"Hello world","created_at":1670000000000,"avatar":"https://example.com/a.png"}]}
        </script>
        </body></html>
    """.trimIndent()

    class FakeWebClient(private val body: String) : WebClient {
        private fun makeResponse(url: String): Response {
            val req = Request.Builder().url(url).build()
            val rb = ResponseBody.create("text/html; charset=utf-8".toMediaType(), body)
            return Response.Builder()
                .request(req)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .body(rb)
                .build()
        }

        override suspend fun httpGet(url: String): Response = makeResponse(url)
        override suspend fun httpGet(url: HttpUrl, extraHeaders: Headers?): Response = makeResponse(url.toString())
        override suspend fun httpGet(url: HttpUrl): Response = makeResponse(url.toString())
        override suspend fun httpHead(url: HttpUrl): Response = makeResponse(url.toString())
        override suspend fun httpPost(url: HttpUrl, form: Map<String, String>, extraHeaders: Headers?): Response = makeResponse(url.toString())
        override suspend fun httpPost(url: HttpUrl, payload: String, extraHeaders: Headers?): Response = makeResponse(url.toString())
        override suspend fun httpPost(url: HttpUrl, body: org.json.JSONObject, extraHeaders: Headers?): Response = makeResponse(url.toString())
        override suspend fun httpPost(url: String, form: Map<String, String>): Response = makeResponse(url)
        override suspend fun httpPost(url: String, payload: String): Response = makeResponse(url)
        override suspend fun httpPost(url: String, body: org.json.JSONObject): Response = makeResponse(url)
        override suspend fun httpGet(url: HttpUrl, extraHeaders: Headers?): Response = makeResponse(url.toString())
        override suspend fun graphQLQuery(endpoint: String, query: String): org.json.JSONObject = org.json.JSONObject()
    }

    class FakeConfig(private val domain: String) : MangaSourceConfig {
        override fun <T> get(key: org.tanukis.tanuki.parsers.config.ConfigKey<T>): T {
            @Suppress("UNCHECKED_CAST")
            return when (key) {
                is org.tanukis.tanuki.parsers.config.ConfigKey.Domain -> domain as T
                is org.tanukis.tanuki.parsers.config.ConfigKey.UserAgent -> "test-agent" as T
                else -> key.defaultValue as T
            }
        }
    }

    class FakeContext : MangaLoaderContext() {
        override val httpClient: okhttp3.OkHttpClient = okhttp3.OkHttpClient()
        override val cookieJar: CookieJar = CookieJar.NO_COOKIES
        override suspend fun evaluateJs(script: String): String? = null
        override suspend fun evaluateJs(baseUrl: String, script: String): String? = null
        override fun getConfig(source: MangaSource): MangaSourceConfig = FakeConfig("asuracomic.net")
        override fun getDefaultUserAgent(): String = "test-agent"
        override fun redrawImageResponse(response: Response, redraw: (image: org.tanukis.tanuki.parsers.bitmap.Bitmap) -> org.tanukis.tanuki.parsers.bitmap.Bitmap): Response = response
        override fun createBitmap(width: Int, height: Int): org.tanukis.tanuki.parsers.bitmap.Bitmap = object: org.tanukis.tanuki.parsers.bitmap.Bitmap {
            override fun getWidth(): Int = width
            override fun getHeight(): Int = height
        }
    }

    @Test
    fun testGetCommentsParsesEmbeddedJson() = runBlocking {
        val ctx = FakeContext()
        val parser = object : AsuraScansParser(ctx) {
            override val webClient: WebClient = FakeWebClient(fixtureHtml)
        }

        val chapter = MangaChapter(
            id = 1L,
            title = "Ch 1",
            number = 1f,
            volume = 0,
            url = "/series/slug/chapter/1",
            scanlator = null,
            uploadDate = 0L,
            branch = null,
            source = MangaParserSource.ASURASCANS,
        )

        val comments = parser.getComments(chapter)
        assertNotNull(comments)
        assertEquals(1, comments.size)
        val c = comments[0]
        assertEquals("Alice", c.author)
        assertTrue(c.content.contains("Hello"))
    }
}
