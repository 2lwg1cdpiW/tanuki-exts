package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("PORNCOMIXONLINE", "PornComix.online", "en", ContentType.HENTAI)
internal class PornComixOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PORNCOMIXONLINE, "porncomix.online") {
	override val listUrl = "comic/"
	override val tagPrefix = "comic-genre/"
	override val stylePage = ""
}
