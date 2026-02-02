package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("HERENSCAN", "HerenScan", "es")
internal class HerenScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HERENSCAN, "herenscan.com") {
	override val datePattern = "dd/MM/yyyy"
}
