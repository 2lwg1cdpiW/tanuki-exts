package org.tanukis.tanuki.parsers.site.mangareader.it

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("WALPURGISCAN", "WalpurgiScan", "it")
internal class Walpurgiscan(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.WALPURGISCAN,
		"www.walpurgiscan.it",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
