package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("LICHMANGAS", "LichMangas", "pt")
internal class LichMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LICHMANGAS, "lichmangas.com", 10) {
	override val datePattern = "dd/MM/yyyy"
}
