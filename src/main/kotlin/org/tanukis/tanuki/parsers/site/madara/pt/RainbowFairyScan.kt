package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RAINBOWFAIRYSCAN", "RainbowFairyScan", "pt")
internal class RainbowFairyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAINBOWFAIRYSCAN, "rainbowfairyscan.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
