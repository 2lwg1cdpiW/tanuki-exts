package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CYPHERSCANS", "CypherScans", "en")
internal class CypherScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.CYPHERSCANS, "cypheroscans.xyz", pageSize = 20, searchPageSize = 10)
