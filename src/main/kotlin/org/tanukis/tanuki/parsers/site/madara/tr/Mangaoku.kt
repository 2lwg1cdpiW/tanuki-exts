package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAOKU", "Mangaoku", "tr")
internal class Mangaoku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOKU, "mangaoku.info", 24) {
	override val datePattern = "dd MMMM yyyy"
	override val listUrl = "seri/"
	override val tagPrefix = "tur/"
}
