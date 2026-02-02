package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("NYXMANGA", "NyxManga", "tr")
internal class NyxManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NYXMANGA, "nyxmanga.com", pageSize = 14, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}