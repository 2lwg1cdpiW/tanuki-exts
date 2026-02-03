package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("STONESCAPE", "StoneScape", "en")
internal class StoneScape(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.STONESCAPE, "stonescape.xyz", 10) {
	override val listUrl = "series/"
	override val tagPrefix = "series-genre/"
}
