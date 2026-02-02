package org.tanukis.tanuki.parsers.site.mangareader.ja

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*
import org.tanukis.tanuki.parsers.Broken

@Broken("Need to rewrite parser, continue with rawkuma.net site, not old.rawkuma.net")
@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RAWKUMA, "old.rawkuma.net", pageSize = 54, searchPageSize = 54) {
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
