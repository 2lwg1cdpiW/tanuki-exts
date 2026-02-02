package org.tanukis.tanuki.parsers.site.mangareader.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("MANGASCHAN", "MangasChan", "pt")
internal class MangasChan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASCHAN, "mangaschan.net", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMMM d, yyyy"
}
