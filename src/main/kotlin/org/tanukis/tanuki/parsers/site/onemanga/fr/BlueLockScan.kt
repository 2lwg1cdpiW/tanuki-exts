package org.tanukis.tanuki.parsers.site.onemanga.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("BLUELOCKSCAN", "BlueLockScan", "fr")
internal class BlueLockScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.BLUELOCKSCAN, "bluelockscan.com")
