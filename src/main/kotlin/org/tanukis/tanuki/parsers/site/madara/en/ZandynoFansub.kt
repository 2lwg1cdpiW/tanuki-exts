package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("ZANDYNOFANSUB", "Zandyno Fansub", "en")
internal class ZandynoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZANDYNOFANSUB, "zandynofansub.aishiteru.org", 20) {
	override val listUrl = "series/"
	override val datePattern = "dd.MM.yyyy"
}
