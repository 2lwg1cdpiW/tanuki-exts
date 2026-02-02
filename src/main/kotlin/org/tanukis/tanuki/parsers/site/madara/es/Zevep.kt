package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("ZEVEP", "Zevep", "es")
internal class Zevep(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZEVEP, "zevep.com", 16)
