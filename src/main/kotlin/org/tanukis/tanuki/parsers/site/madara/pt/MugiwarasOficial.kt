package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MUGIWARASOFICIAL", "MugiwarasOficial", "pt")
internal class MugiwarasOficial(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MUGIWARASOFICIAL, "mugiwarasoficial.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
