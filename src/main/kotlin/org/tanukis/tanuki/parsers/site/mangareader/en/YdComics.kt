package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("YDCOMICS", "YdComics", "en")
internal class YdComics(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.YDCOMICS, "yd-comics.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/index.php/series"
}
