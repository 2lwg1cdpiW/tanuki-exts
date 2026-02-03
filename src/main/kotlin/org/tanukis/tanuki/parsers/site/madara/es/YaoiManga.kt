package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGA", "YaoiManga", "es")
internal class YaoiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGA, "yaoimanga.es", 42)
