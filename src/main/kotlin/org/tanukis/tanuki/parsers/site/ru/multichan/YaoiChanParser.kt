package org.tanukis.tanuki.parsers.site.ru.multichan

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.Manga
import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.model.SortOrder
import org.tanukis.tanuki.parsers.util.*
import java.util.EnumSet

@MangaSourceParser("YAOICHAN", "Яой-тян", "ru")
internal class YaoiChanParser(context: MangaLoaderContext) : ChanParser(context, MangaParserSource.YAOICHAN) {

	override val configKeyDomain = ConfigKey.Domain(
		"v9.yaoi-chan.me",
		"v10.yaoi-chan.me",
		"v3.yaoi-chan.me",
		"v2.yaoi-chan.me",
		"v1.yaoi-chan.me",
		"yaoi-chan.me",
	)

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.NEWEST)

	override suspend fun getDetails(manga: Manga): Manga {
		val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val root = doc.body().requireElementById("dle-content")
		return manga.copy(
			description = root.getElementById("description")?.html()?.substringBeforeLast("<div"),
			largeCoverUrl = root.getElementById("cover")?.absUrl("src"),
			chapters = root.select("table.table_cha").flatMap { table ->
				table.select("div.manga")
			}.mapNotNull { it.selectFirst("a") }.mapChapters(reversed = true) { i, a ->
				val href = a.attrAsRelativeUrl("href")
				MangaChapter(
					id = generateUid(href),
					title = a.text(),
					number = i + 1f,
					volume = 0,
					url = href,
					uploadDate = 0L,
					source = source,
					scanlator = null,
					branch = null,
				)
			},
		)
	}
}
