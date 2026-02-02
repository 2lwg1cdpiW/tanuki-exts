package org.tanukis.tanuki.parsers.site.mangareader.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("FRANXXMANGAS", "FranxxMangas", "pt")
internal class FranxxMangas(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FRANXXMANGAS, "franxxmangas.net", pageSize = 10, searchPageSize = 10)
