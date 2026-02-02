package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ROGMANGAS", "RogMangas", "pt")
internal class RogMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ROGMANGAS, "rogmangas.com", 51) {
	override val datePattern: String = "dd/MM/yyyy"
}
