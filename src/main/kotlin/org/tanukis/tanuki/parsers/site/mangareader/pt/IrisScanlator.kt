package org.tanukis.tanuki.parsers.site.mangareader.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("IRISSCANLATOR", "IrisScanlator", "pt")
internal class IrisScanlator(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.IRISSCANLATOR,
		"irisscanlator.com.br",
		pageSize = 20,
		searchPageSize = 10,
	)
