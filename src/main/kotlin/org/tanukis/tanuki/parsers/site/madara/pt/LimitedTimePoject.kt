package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("LIMITEDTIMEPOJECT", "LimitedTimePoject", "pt")
internal class LimitedTimePoject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIMITEDTIMEPOJECT, "limitedtimeproject.com", 10) {
	override val listUrl = "manhwa/"
	override val tagPrefix = "manhwa-genero/"
	override val datePattern = "dd/MM/yyyy"
}
