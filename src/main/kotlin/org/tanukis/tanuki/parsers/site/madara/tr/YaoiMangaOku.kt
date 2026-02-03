package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGAOKU", "YaoiMangaOku", "tr", ContentType.HENTAI)
internal class YaoiMangaOku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGAOKU, "yaoimangaoku.net", 16) {
	override val datePattern = "d MMMM yyyy"
}
