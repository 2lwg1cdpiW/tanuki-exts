package org.tanukis.tanuki.parsers.site.mangareader.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import org.tanukis.tanuki.parsers.model.*
import org.tanukis.tanuki.parsers.util.*

@MangaSourceParser("POINTZEROTOONS", "PointZero Toons", "pt")
internal class PointZeroToons(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.POINTZEROTOONS, "pointzerotoons.com", pageSize = 20, searchPageSize = 10) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val chapters = docs.select(selectChapter).mapChapters { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			val name = element.selectFirst(".chapternum")?.text() ?: "Chapter ${index + 1}"
			val numChap = findNumChap(name)
			MangaChapter(
				id = generateUid(url),
				title = name,
				url = url,
				number = numChap,
				volume = 0,
				scanlator = null,
				uploadDate = 0,
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}

	private fun findNumChap(name: String): Float {
		val regex = Regex("\\d+")
		val num = regex.find(name)
		return num?.value?.toFloat() ?: 0f
	}
}
