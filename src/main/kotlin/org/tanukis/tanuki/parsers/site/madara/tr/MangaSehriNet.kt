package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASEHRINET", "MangaSehri.net", "tr")
internal class MangaSehriNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASEHRINET, "manga-sehri.net", 20) {
	override val datePattern = "dd MMMM yyyy"
}
