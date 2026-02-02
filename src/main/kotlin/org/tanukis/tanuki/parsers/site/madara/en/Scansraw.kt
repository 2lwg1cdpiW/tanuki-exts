package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SCANSRAW", "AquaScans.com", "en")
internal class Scansraw(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANSRAW, "aquascans.com", 10)
