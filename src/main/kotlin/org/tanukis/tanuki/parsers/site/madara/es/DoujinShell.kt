package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("DOUJINSHELL", "DoujinShell", "es", ContentType.HENTAI)
internal class DoujinShell(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJINSHELL, "www.doujinshell.com", 10) {
	override val datePattern = "dd MMMM, yyyy"
	override val listUrl = "doujin/"
	override val tagPrefix = "doujin-genero/"
	override val selectPage = "img:not(.aligncenter)"
}
