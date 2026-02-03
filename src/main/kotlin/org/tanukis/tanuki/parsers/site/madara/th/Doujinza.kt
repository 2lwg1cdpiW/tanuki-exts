package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("DOUJINZA", "Doujinza", "th", ContentType.HENTAI)
internal class Doujinza(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJINZA, "doujinza.com", 24) {
	override val withoutAjax = true
	override val datePattern = "MMMM dd, yyyy"
	override val listUrl = "doujin/"
	override val tagPrefix = "doujin-genre/"
}
