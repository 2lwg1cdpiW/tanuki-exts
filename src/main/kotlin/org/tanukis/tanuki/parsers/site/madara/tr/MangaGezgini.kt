package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAGEZGINI", "MangaGezgini", "tr")
internal class MangaGezgini(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAGEZGINI, "mangagezginim.com", pageSize = 20) {
	override val datePattern = "dd/MM/yyyy"
}
