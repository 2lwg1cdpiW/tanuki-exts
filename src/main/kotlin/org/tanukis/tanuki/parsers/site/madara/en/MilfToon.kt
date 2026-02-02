package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MILFTOON", "MilfToon", "en", ContentType.HENTAI)
internal class MilfToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MILFTOON, "milftoon.xxx", 20) {
	override val postReq = true
	override val datePattern = "d MMMM, yyyy"
}
