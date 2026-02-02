package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("REAPERSCANSUNORIGINAL", "ReaperScansUnoriginal", "en")
internal class ReaperScansUnoriginal(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.REAPERSCANSUNORIGINAL,
		"reaper-scans.com",
		pageSize = 30,
		searchPageSize = 42,
	)
