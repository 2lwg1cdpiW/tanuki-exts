package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANWE", "Manwe", "tr")
internal class Manwe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANWE, "manwe.pro", 20)
