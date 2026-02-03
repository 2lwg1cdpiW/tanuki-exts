package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("SPIDERSCANS", "SpiderScans", "en")
internal class SpiderScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SPIDERSCANS, "spiderscans.xyz", pageSize = 20, searchPageSize = 10)
