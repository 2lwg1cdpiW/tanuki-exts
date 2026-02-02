package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PANCONCOLA", "Panconcola", "es")
internal class Panconcola(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PANCONCOLA, "artessupremas.com") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "generos-de-manga/"
}
