package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("ARYASCANS", "AryaScans", "en")
internal class AryaScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARYASCANS, "aryascans.com")
