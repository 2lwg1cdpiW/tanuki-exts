package org.tanukis.tanuki.parsers.site.liliana.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.liliana.LilianaParser

@MangaSourceParser("MANHUAGOLD", "ManhuaGold", "en")
internal class ManhuaGold(context: MangaLoaderContext) :
	LilianaParser(context, MangaParserSource.MANHUAGOLD, "manhuagold.top")
