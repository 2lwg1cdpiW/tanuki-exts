package org.tanukis.tanuki.parsers.site.mangareader.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJIN69", "Doujin69", "th", type = ContentType.HENTAI)
internal class Doujin69(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DOUJIN69, "doujin69.com", pageSize = 40, searchPageSize = 21) {
	override val listUrl = "/doujin"

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
