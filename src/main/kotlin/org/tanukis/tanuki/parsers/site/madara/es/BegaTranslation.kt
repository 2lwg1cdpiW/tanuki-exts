package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("BEGATRANSLATION", "BegaTranslation", "es")
internal class BegaTranslation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEGATRANSLATION, "begatranslation.com") {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "series/"
}
