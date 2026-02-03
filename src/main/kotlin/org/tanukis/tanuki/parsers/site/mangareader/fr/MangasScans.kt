package org.tanukis.tanuki.parsers.site.mangareader.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASSCANS", "MangasScans", "fr")
internal class MangasScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASSCANS, "mangas-scans.com", pageSize = 30, searchPageSize = 10)
