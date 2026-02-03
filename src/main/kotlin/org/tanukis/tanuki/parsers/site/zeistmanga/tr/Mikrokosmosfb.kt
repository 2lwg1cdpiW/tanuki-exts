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

@MangaSourceParser("MIKROKOSMOSFB", "Mikrokosmosfb", "tr", ContentType.HENTAI)
internal class Mikrokosmosfb(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MIKROKOSMOSFB, "mikrokosmosfb.blogspot.com") {
	override val sateOngoing: String = "Devam Ediyor"
	override val sateFinished: String = "Tamamlandı"
	override val sateAbandoned: String = "Güncel"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		val tags = doc.selectFirstOrThrow("script:containsData(label: )").data()
			.substringAfter("label: [").substringBefore("]").replace("\"", "").split(", ")
		return tags.mapToSet {
			MangaTag(
				key = it,
				title = it,
				source = source,
			)
		}
	}
}
