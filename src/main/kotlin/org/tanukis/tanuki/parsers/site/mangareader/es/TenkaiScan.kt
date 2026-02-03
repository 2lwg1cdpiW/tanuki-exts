package org.tanukis.tanuki.parsers.site.mangareader.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken("Not dead, changed template")
@MangaSourceParser("TENKAISCAN", "TenkaiScan", "es", ContentType.HENTAI)
internal class TenkaiScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TENKAISCAN, "falcoscan.net", 20, 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
