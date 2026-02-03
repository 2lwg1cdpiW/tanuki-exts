package org.tanukis.tanuki.parsers.site.mangareader.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("KOMIKPOI", "KomikPoi", "id", ContentType.HENTAI)
internal class KomikPoi(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKPOI, "komikpoi.com", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
