package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("INARIPIKAV", "InariPikav", "es")
internal class InariPikav(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.INARIPIKAV,
		"clubinari.org",
		pageSize = 10,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
