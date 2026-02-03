package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("WHALEMANGA", "WhaleManga", "en")
internal class WhaleManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WHALEMANGA, "whalemanga.com", 10)
