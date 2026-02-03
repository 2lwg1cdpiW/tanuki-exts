package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("ASURASCANSGG", "AsuraScansGg", "en")
internal class AsuraScansGg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASURASCANSGG, "asurascans.us")
