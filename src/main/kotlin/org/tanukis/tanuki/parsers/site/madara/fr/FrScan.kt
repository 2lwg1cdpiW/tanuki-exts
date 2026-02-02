package org.tanukis.tanuki.parsers.site.madara.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaPage
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.util.*

@Broken
@MangaSourceParser("FRSCAN", "Fr-Scan", "fr")
internal class FrScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FRSCAN, "fr-scan.com") {
	override val stylePage = ""

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val preloadImg = doc.getElementById("chapter_preloaded_images")
		if (preloadImg != null) {
			val img = preloadImg.data().substringAfter("[").substringBeforeLast("]")
				.replace("\\", "").replace("\"", "").split(",")
			return img.map { url ->
				MangaPage(
					id = generateUid(url),
					url = url,
					preview = null,
					source = source,
				)
			}
		} else {
			return doc.body().selectFirstOrThrow(selectBodyPage).select(selectPage).map { div ->
				val img = div.selectFirstOrThrow("img")
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
}
