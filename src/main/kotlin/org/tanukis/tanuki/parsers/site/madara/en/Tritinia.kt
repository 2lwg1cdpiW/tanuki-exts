package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("TRITINIA", "Tritinia", "en")
internal class Tritinia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TRITINIA, "tritinia.org")
