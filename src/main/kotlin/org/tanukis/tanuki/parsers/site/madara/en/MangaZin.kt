package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAZIN", "MangaZin", "en")
internal class MangaZin(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAZIN, "mangazin.org")
