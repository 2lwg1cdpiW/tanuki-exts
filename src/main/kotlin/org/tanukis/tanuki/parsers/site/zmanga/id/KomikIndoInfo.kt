package org.tanukis.tanuki.parsers.site.zmanga.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zmanga.ZMangaParser

@Broken("Redirect to @MANGASUSUKU")
@MangaSourceParser("KOMIKINDO_INFO", "KomikIndo.info", "id", ContentType.HENTAI)
internal class KomikIndoInfo(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.KOMIKINDO_INFO, "mangasusuku.com") {
	override val datePattern = "dd MMM yyyy"
}
