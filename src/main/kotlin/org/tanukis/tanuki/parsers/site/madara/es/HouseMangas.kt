package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("HOUSEMANGAS", "HouseMangas", "es")
internal class HouseMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEMANGAS, "visormanga.com")
