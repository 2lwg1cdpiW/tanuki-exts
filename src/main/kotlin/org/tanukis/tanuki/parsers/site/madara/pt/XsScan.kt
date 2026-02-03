package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("XSSCAN", "XsScan", "pt")
internal class XsScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.XSSCAN, "xsscan.xyz") {
	override val datePattern: String = "dd/MM/yyyy"
}
