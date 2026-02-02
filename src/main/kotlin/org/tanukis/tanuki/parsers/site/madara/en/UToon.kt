package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("UTOON", "UToon", "en")
internal class UToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.UTOON, "utoon.net") {
	override val datePattern = "dd MMM"
}
