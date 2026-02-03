package org.tanukis.tanuki.parsers.site.zeistmanga.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.model.MangaTag
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser
import org.tanukis.tanuki.parsers.util.mapToSet
import org.tanukis.tanuki.parsers.util.parseHtml
import org.tanukis.tanuki.parsers.util.selectFirstOrThrow

@MangaSourceParser("SNSCOEURTURKEY", "SnscoeurTurkey", "tr", ContentType.HENTAI)
internal class SnscoeurTurkey(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SNSCOEURTURKEY, "snscoeurturkey.blogspot.com") {
	override val sateOngoing: String = "Güncel"
	override val sateFinished: String = "Final"
	override val sateAbandoned: String = "Düzenleniyor"

	override val mangaCategory = "Seriler"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain/p/gelismis-arama.html").parseHtml()
		return doc.selectFirstOrThrow("div.filter").select("ul li").mapToSet {
			MangaTag(
				key = it.selectFirstOrThrow("input").attr("value"),
				title = it.selectFirstOrThrow("label").text(),
				source = source,
			)
		}
	}
}
