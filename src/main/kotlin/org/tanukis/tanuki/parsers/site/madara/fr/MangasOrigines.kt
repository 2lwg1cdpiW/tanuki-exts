package org.tanukis.tanuki.parsers.site.madara.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASORIGINES", "MangasOrigines.fr", "fr")
internal class MangasOrigines(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASORIGINES, "mangas-origines.fr") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-genres/"
	override val listUrl = "oeuvre/"
}
