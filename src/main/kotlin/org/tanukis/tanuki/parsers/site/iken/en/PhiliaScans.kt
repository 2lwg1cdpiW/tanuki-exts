package org.tanukis.tanuki.parsers.site.iken.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.iken.IkenParser
import org.tanukis.tanuki.parsers.model.*
import org.tanukis.tanuki.parsers.util.*

@MangaSourceParser("PHILIASCANS", "PhiliaScans", "en")
internal class PhiliaScans(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.PHILIASCANS, "philiascans.org", 18) {

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		return doc.select(selectPages).map { img ->
			val url = img.requireSrc()
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}