package org.tanukis.tanuki.parsers.site.gallery.all

import okhttp3.Interceptor
import okhttp3.Response
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.gallery.GalleryParser

@MangaSourceParser("KIUTAKU", "Kiutaku", type = ContentType.OTHER)
internal class Kiutaku(context: MangaLoaderContext) :
	GalleryParser(context, MangaParserSource.KIUTAKU, "kiutaku.com") {

	override fun intercept(chain: Interceptor.Chain): Response {
		val request = chain.request()
		val url = request.url.toString()

		val headers = if (url.contains("wp-content")) {
			request.headers.newBuilder()
				.removeAll("Referer")
				.build()
		} else {
			request.headers
		}

		val newRequest = request.newBuilder()
			.headers(headers)
			.build()

		return chain.proceed(newRequest)
	}
}
