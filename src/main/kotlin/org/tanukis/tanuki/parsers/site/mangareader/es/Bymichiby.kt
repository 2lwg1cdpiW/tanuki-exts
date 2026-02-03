package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("BYMICHIBY", "Bymichiby", "es", ContentType.HENTAI)
internal class Bymichiby(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.BYMICHIBY, "bymichiby.com", pageSize = 20, searchPageSize = 10)
