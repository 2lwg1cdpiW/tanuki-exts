package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("ARCANESCANS", "ArcaneScans", "en")
internal class ArcaneScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARCANESCANS, "arcanescans.com", 10)
