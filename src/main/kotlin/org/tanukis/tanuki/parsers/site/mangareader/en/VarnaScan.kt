package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("VARNASCAN", "VarnaScan", "en")
internal class VarnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VARNASCAN, "varnascan.xyz", pageSize = 20, searchPageSize = 10)
