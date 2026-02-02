package org.tanukis.tanuki.parsers.site.pizzareader.it

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("LUPITEAM", "LupiTeam", "it")
internal class LupiTeam(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.LUPITEAM, "lupiteam.net")
