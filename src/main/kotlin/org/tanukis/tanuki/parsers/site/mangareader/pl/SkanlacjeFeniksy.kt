package org.tanukis.tanuki.parsers.site.mangareader.pl

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SKANLACJEFENIKSY", "SkanlacjeFeniksy", "pl")
internal class SkanlacjeFeniksy(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SKANLACJEFENIKSY,
		"skanlacje-feniksy.pl",
		pageSize = 10,
		searchPageSize = 10,
	) {
	override val datePattern = "d MMMM, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
