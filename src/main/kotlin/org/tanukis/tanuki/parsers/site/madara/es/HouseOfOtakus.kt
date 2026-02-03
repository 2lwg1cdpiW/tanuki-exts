package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HOUSEOFOTAKUS", "HouseOfOtakus", "es")
internal class HouseOfOtakus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEOFOTAKUS, "houseofotakus.xyz")
