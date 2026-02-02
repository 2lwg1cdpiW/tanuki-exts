package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALC", "MangaLc", "th")
internal class MangaLc(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALC, "manga-lc.net", 24) {
	override val datePattern: String = "d MMMM yyyy"
	override val selectPage = "img"
}
