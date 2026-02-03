package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaPage
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.util.toAbsoluteUrl
import org.tanukis.tanuki.parsers.util.toRelativeUrl

@MangaSourceParser("HIPERDEX", "HiperToon", "en", ContentType.HENTAI)
internal class HiperDex(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HIPERDEX, "hiperdex.com", 36) {

	override val listUrl = ""

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		// Remove ?style=list parameter from chapter URLs
		val absoluteUrl = chapter.url.toAbsoluteUrl(domain)
		val cleanUrl = if (absoluteUrl.contains("?style=list")) {
			absoluteUrl.replace("?style=list", "")
				.replace("&style=list", "")
		} else {
			absoluteUrl
		}
		val relativeCleanUrl = cleanUrl.toRelativeUrl(domain)
		val modifiedChapter = chapter.copy(url = relativeCleanUrl)
		return super.getPages(modifiedChapter)
	}
}
