package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MI2MANGAES", "Mi2MangaEs", "es")
internal class Mi2MangaEs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MI2MANGAES, "mi2manga.lat", 10)
