package org.tanukis.tanuki.parsers.site.mangareader.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("THUNDERSCANS", "ThunderScans", "ar")
internal class ThunderScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.THUNDERSCANS,
		"lavascans.com",
		pageSize = 32,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
	override val selectChapter = ".eplister > ul > li"
}
