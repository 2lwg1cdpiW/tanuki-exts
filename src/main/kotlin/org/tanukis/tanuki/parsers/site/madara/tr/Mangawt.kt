package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWT", "MangaWt.com", "tr")
internal class Mangawt(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWT, "mangawt.com")
