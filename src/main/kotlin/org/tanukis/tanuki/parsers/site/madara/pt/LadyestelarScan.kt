package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LADYESTELARSCAN", "LadyEstelarScan", "pt")
internal class LadyestelarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LADYESTELARSCAN, "ladyestelarscan.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
