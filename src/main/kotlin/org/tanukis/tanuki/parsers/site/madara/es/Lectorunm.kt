package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LECTORUNM", "Lectorunm.life", "es")
internal class Lectorunm(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORUNM, "lectorunm.life") {
	override val datePattern = "dd/MM/yyyy"
}
