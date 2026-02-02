package org.tanukis.tanuki.parsers.site.zeistmanga.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("DATGARSCANLATION", "DatgarScanlation", "es")
internal class DatgarScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.DATGARSCANLATION, "datgarscanlation.blogspot.com")
