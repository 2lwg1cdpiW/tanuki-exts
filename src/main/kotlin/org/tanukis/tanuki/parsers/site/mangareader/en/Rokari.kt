package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("ROKARICOMICS", "Rokari Comics", "en")
internal class RokariComics(context: MangaLoaderContext) :
	MangaReaderParser(
		context = context,
		source = MangaParserSource.ROKARICOMICS,
		domain = "rokaricomics.com",
		pageSize = 20,
		searchPageSize = 10,
	) {

	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectChapter = "#chapterlist > ul > li:has(a[href])"

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)

}
