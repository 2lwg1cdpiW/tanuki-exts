package org.tanukis.tanuki.parsers.site.mangareader.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGA689", "Manga689", "th")
internal class Manga689(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGA689, "manga689.com", pageSize = 45, searchPageSize = 21) {
	override val listUrl = "/read"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
