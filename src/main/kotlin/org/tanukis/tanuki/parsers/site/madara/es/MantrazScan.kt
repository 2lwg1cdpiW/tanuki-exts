package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANTRAZSCAN", "MantrazScan", "es")
internal class MantrazScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANTRAZSCAN, "mantrazscan.org") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "generos-de-manga/"
}
