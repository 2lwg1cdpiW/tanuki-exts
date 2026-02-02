package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAHOT", "ManhuaHot", "en")
internal class Manhuahot(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAHOT, "manhuahot.com", 10)
