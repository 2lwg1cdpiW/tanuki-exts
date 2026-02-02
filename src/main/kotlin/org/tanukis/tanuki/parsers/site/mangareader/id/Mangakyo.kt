package org.tanukis.tanuki.parsers.site.mangareader.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAKYO", "MangaKyo", "id")
internal class Mangakyo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAKYO, "mangakyo.vip", pageSize = 40, searchPageSize = 20) {
	override val listUrl = "/komik"
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
