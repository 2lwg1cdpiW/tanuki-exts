package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("BIRDMANGA", "BirdManga", "en")
internal class BirdManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.BIRDMANGA, "birdmanga.com", pageSize = 20, searchPageSize = 10) {
	override val encodedSrc = true

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
