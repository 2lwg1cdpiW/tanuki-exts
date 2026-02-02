package org.tanukis.tanuki.parsers.site.guya.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.guya.GuyaParser

@MangaSourceParser("GUYACUBARI", "GuyaCubari", "en")
internal class GuyaCubari(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.GUYACUBARI, "guya.cubari.moe")
