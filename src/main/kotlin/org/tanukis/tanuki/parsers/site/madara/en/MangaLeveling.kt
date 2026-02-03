package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEVELING", "MangaLeveling", "en")
internal class MangaLeveling(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEVELING, "mangaleveling.com", 30) {
	override val postReq = true
	override val tagPrefix = "comics-genre/"
	override val listUrl = "comics/"
	override val datePattern = "MM/dd/yyyy"
}
