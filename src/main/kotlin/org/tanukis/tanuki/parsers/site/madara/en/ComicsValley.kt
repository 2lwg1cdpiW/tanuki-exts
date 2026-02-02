package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICSVALLEY", "ComicsValley", "en", ContentType.HENTAI)
internal class ComicsValley(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICSVALLEY, "comicsvalley.com") {
	override val listUrl = "adult-comics/"
	override val tagPrefix = "comic-genre/"
	override val datePattern = "dd/MM/yyyy"
}
