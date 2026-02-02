package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASTARZ", "Manga-Starz", "ar")
internal class MangaStarz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASTARZ, "manga-starz.com", pageSize = 10) {
	override val datePattern = "d MMMM، yyyy"
	override val stylePage = ""
}
