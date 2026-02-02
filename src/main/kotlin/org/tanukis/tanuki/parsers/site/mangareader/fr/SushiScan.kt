package org.tanukis.tanuki.parsers.site.mangareader.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken("Blocked by Cloudflare")
@MangaSourceParser("SUSHISCAN", "SushiScan.Net", "fr")
internal class SushiScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SUSHISCAN, "sushiscan.net", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/catalogue"
	override val datePattern = "MMM d, yyyy"
}
