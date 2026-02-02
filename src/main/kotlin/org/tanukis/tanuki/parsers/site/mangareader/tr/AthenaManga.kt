package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ATHENAMANGA", "AthenaManga", "tr")
internal class AthenaManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ATHENAMANGA, "athenamanga.com", pageSize = 20, searchPageSize = 10) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isMultipleTagsSupported = false,
		)
}
