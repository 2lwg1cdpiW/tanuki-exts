package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("RUYAMANGA", "RuyaManga", "tr")
internal class RuyaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RUYAMANGA, "ruyamanga.net", 18) {
	override val tagPrefix = "manga-kategori/"
	override val datePattern = "dd/MM/yyyy"
}
