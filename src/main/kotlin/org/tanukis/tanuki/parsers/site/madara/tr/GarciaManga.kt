package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("GARCIAMANGA", "GarciaManga", "tr")
internal class GarciaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GARCIAMANGA, "garciamanga.com", 20) {
	override val selectPage = "img"
}
