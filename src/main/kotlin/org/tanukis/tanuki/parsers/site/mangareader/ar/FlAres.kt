package org.tanukis.tanuki.parsers.site.mangareader.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FLARES", "Fl-Ares", "ar")
internal class FlAres(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FLARES, "fl-ares.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val encodedSrc = true
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
