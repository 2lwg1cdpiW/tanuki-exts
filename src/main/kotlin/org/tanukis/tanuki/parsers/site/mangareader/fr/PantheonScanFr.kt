package org.tanukis.tanuki.parsers.site.mangareader.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("PANTHEONSCAN_FR", "PantheonScan.fr", "fr")
internal class PantheonScanFr(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.PANTHEONSCAN_FR,
		"www.pantheon-scan.fr",
		pageSize = 40,
		searchPageSize = 10,
	)
