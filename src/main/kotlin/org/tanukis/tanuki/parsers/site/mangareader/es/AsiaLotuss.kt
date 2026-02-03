package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ASIALOTUSS", "AsiaLotuss", "es")
internal class AsiaLotuss(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ASIALOTUSS, "asialotuss.com", pageSize = 20, searchPageSize = 10)
