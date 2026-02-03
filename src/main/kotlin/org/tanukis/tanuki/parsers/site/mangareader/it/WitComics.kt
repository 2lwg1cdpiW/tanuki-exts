package org.tanukis.tanuki.parsers.site.mangareader.it

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("WITCOMICS", "WitComics", "it")
internal class WitComics(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.WITCOMICS, "www.witcomics.net", pageSize = 5, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
