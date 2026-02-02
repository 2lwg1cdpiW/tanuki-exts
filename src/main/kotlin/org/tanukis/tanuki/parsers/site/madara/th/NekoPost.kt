package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken("Redirect to @KINGS_MANGA")
@MangaSourceParser("NEKOPOST", "NekoPost", "th", ContentType.HENTAI)
internal class NekoPost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEKOPOST, "www.superdoujin.org") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
