package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ZAMANMANGA", "ZamanManga", "tr")
internal class ZamanManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZAMANMANGA, "zamanmanga.com") {
	override val datePattern = "dd MMMM yyyy"
}