package org.tanukis.tanuki.parsers.site.natsu.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.MangaPage
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.natsu.NatsuParser
import org.tanukis.tanuki.parsers.util.generateUid
import org.tanukis.tanuki.parsers.util.parseHtml
import org.tanukis.tanuki.parsers.util.requireSrc
import org.tanukis.tanuki.parsers.util.toAbsoluteUrl
import org.tanukis.tanuki.parsers.util.toRelativeUrl

@MangaSourceParser("KIRYUU", "Kiryuu", "id")
internal class Kiryuu(context: MangaLoaderContext) :
	NatsuParser(context, MangaParserSource.KIRYUU, pageSize = 24) {
	override val configKeyDomain = ConfigKey.Domain(
		"kiryuu03.com",
		"kiryuu04.com",
		"kiryuu05.com",
		"kiryuu.id",
	)

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		// Images are in a section with data-image-data attribute
		return doc.select("section[data-image-data] img").map { img ->
			val url = img.requireSrc().toRelativeUrl(domain)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
