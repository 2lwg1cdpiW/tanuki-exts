package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAREADCO", "MangaRead.co", "en")
internal class MangaReadCo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAREADCO, "mangaread.co", 16) {
	override val tagPrefix = "m-genre/"
	override val datePattern = "yyyy-MM-dd"
}
