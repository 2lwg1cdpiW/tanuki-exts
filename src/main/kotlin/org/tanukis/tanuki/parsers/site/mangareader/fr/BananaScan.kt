package org.tanukis.tanuki.parsers.site.mangareader.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("BANANASCAN", "BananaScan", "fr")
internal class BananaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.BANANASCAN, "banana-scan.com", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
}
