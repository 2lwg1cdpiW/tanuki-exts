package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.Locale
import org.tanukis.tanuki.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("CATHARSISWORLD", "CatharsisWorld", "es")
internal class CatharsisWorld(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.CATHARSISWORLD, "catharsisworld.dig-it.info", pageSize = 30, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
