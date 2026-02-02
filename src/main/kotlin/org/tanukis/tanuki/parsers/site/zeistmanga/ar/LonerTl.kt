package org.tanukis.tanuki.parsers.site.zeistmanga.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("LONERTL", "LonerTranslations", "ar")
internal class LonerTl(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.LONERTL, "loner-tl.blogspot.com") {
	override val sateOngoing: String = "مستمرة"
	override val sateFinished: String = "مكتملة"
	override val sateAbandoned: String = "متوقفة"
}
