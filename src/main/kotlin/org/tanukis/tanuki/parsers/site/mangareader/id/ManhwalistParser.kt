package org.tanukis.tanuki.parsers.site.mangareader.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANHWALIST", "ManhwaList", "id")
internal class ManhwalistParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWALIST, "manhwalist.xyz", pageSize = 24, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
