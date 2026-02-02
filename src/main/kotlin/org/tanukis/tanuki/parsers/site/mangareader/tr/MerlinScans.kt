package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MERLINSCANS", "MerlinScans", "tr")
internal class MerlinScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MERLINSCANS, "merlinscans.com", pageSize = 20, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
