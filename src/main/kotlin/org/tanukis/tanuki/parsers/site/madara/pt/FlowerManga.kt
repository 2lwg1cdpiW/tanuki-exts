package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("FLOWERMANGA", "FlowerManga", "pt")
internal class FlowerManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FLOWERMANGA, "flowermanga.net", 24) {
	override val datePattern = "d MMMM yyyy"
}
