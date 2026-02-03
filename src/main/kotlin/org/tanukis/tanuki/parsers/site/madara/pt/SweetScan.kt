package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("SWEETSCAN", "SweetScan", "pt")
internal class SweetScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SWEETSCAN, "sweetscan.net") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
