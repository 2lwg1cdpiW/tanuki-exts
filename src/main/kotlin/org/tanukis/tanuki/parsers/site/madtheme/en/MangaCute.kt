package org.tanukis.tanuki.parsers.site.madtheme.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaPage
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madtheme.MadthemeParser
import org.tanukis.tanuki.parsers.util.toAbsoluteUrl
import org.tanukis.tanuki.parsers.util.generateUid
import org.tanukis.tanuki.parsers.util.parseHtml

@MangaSourceParser("MANGACUTE", "MangaCute", "en")
internal class MangaCute(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.MANGACUTE, "mangacute.com") {

	private val subDomain = "sb.mbcdn.xyz"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val regexPages = Regex("chapImages\\s*=\\s*['\"](.*?)['\"]")
		val pages = doc.select("script").firstNotNullOfOrNull { script ->
			regexPages.find(script.html())?.groupValues?.getOrNull(1)
		}?.split(',')

		return pages?.map { url ->
			val cleanUrl = url.substringAfter("/manga")
			MangaPage(
				id = generateUid(url),
				url = "https://$subDomain/manga$cleanUrl",
				preview = null,
				source = source,
			)
		} ?: emptyList()
	}
}
