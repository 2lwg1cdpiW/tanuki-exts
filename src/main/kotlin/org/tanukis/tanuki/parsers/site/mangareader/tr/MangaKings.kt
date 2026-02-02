package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAKINGS", "MangaKings", "tr")
internal class MangaKings(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAKINGS, "mangakings.com.tr", pageSize = 20, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
