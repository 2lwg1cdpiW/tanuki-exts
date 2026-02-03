package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("FAYSCANS", "FayScans", "pt")
internal class FayScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FAYSCANS, "fayscans.net") {
	override val datePattern: String = "dd/MM/yyyy"
}
