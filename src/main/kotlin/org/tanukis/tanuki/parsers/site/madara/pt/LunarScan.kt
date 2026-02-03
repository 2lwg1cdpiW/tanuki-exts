package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LUNARSCAN", "LunarrScan.com", "pt")
internal class LunarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LUNARSCAN, "lunarrscan.com")
