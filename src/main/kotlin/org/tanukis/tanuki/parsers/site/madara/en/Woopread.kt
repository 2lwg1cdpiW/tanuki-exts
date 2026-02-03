package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("WOOPREAD", "Woopread", "en")
internal class Woopread(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WOOPREAD, "woopread.com", 10) {
	override val listUrl = "series/"
	override val tagPrefix = "series-genres/"
}
