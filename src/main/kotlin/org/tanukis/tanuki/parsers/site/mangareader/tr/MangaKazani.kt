package org.tanukis.tanuki.parsers.site.mangareader.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("MANGAKAZANI", "MangaKazani", "tr")
internal class MangaKazani(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAKAZANI, "mangakazani.com", pageSize = 19, searchPageSize = 10) {
	override val listUrl = "/seriler"
}
