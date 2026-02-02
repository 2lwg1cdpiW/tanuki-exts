package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SEREINSCAN", "SereinScan", "tr")
internal class SereinScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SEREINSCAN, "sereinscan.com", pageSize = 20, searchPageSize = 10)
