package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASEHRI", "MangaSehri.com", "tr")
internal class Mangasehri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASEHRI, "manga-sehri.com", 18) {
	override val datePattern = "dd/MM/yyyy"
}
