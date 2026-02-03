package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAKISS", "MangaKiss", "en")
internal class MangaKiss(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAKISS, "mangakiss.org", 10)
