package org.tanukis.tanuki.parsers.site.mangareader.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAFLAME", "MangaFlame", "ar")
internal class MangaFlame(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAFLAME, "mangaflame.org", pageSize = 20, searchPageSize = 10)
