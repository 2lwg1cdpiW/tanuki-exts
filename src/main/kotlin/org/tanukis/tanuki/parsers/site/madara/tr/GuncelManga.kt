package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("GUNCEL_MANGA", "GuncelManga", "tr")
internal class GuncelManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GUNCEL_MANGA, "guncelmanga.net") {
	override val datePattern = "d MMMM yyyy"
}
