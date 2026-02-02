package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ZENITHSCANS", "ZenithScans", "tr")
internal class ZenithScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ZENITHSCANS, "zenithscans.com", pageSize = 20, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
