package org.tanukis.tanuki.parsers.site.mangareader.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken("Redirect to @FLIXSCANS")
@MangaSourceParser("SNOWSCANS", "SnowScans", "en")
internal class SnowScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SNOWSCANS, "flixscans.net", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
}
