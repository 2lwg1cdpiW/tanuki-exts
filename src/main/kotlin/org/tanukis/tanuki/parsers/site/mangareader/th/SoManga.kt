package org.tanukis.tanuki.parsers.site.mangareader.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SOMANGA", "SoManga", "th")
internal class SoManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SOMANGA, "so-manga.com", pageSize = 5, searchPageSize = 25)
