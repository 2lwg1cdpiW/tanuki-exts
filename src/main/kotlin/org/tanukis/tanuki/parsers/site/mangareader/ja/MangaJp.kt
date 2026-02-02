package org.tanukis.tanuki.parsers.site.mangareader.ja

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANGAJP", "MangaJp", "ja")
internal class MangaJp(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAJP, "mangajp.top", pageSize = 54, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
