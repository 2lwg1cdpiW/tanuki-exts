package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALINKNET", "Link-Manga.com", "ar")
internal class MangaLinkNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALINKNET, "link-manga.com", pageSize = 10)
