package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAFAST", "ManhuaFast", "en")
internal class Manhuafast(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAFAST, "manhuafast.com")
