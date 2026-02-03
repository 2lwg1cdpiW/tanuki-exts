package org.tanukis.tanuki.parsers.site.zeistmanga.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YAOIFANCLUB", "YaoiFanClub", "pt")
internal class YaoiFanClub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YAOIFANCLUB, "www.yaoifanclub.com") {
	override val sateOngoing: String = "Ativo"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
