package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DTUPSCAN", "DtupScan", "es")
internal class DtupScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DTUPSCAN, "dtupscan.com", pageSize = 20, searchPageSize = 10)
