package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALAND", "MangaLand", "es", ContentType.HENTAI)
internal class MangaLand(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALAND, "mangaland.net")
