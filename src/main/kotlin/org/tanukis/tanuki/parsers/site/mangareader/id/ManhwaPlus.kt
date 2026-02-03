package org.tanukis.tanuki.parsers.site.mangareader.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaListFilterCapabilities
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken
@MangaSourceParser("MANHWAPLUS", "ManhwaPlus", "id", ContentType.HENTAI)
internal class ManhwaPlus(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWAPLUS, "manhwablue.com", 20, 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "/komik"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}