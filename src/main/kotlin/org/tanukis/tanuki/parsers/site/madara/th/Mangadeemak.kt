package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGADEEMAK", "MangaDeemak", "th")
internal class Mangadeemak(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGADEEMAK, "mangadeemak.com", 12) {
	override val datePattern: String = "d MMMM yyyy"
}
