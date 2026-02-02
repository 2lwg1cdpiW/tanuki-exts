package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("TERRITORIOLEAL", "TerritorioLeal", "es")
internal class TerritorioLeal(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TERRITORIOLEAL, "territorioleal.com") {
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
