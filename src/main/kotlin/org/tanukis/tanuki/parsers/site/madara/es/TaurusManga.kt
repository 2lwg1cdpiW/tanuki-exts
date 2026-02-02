package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("TAURUSMANGA", "TaurusManga", "es")
internal class TaurusManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TAURUSMANGA, "taurus.topmanhuas.org") {
	override val datePattern = "dd/MM/yyyy"
}
