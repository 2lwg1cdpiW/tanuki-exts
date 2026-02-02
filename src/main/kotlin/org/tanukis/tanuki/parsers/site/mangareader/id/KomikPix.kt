package org.tanukis.tanuki.parsers.site.mangareader.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("KOMIKPIX", "KomikPix", "id", ContentType.HENTAI)
internal class KomikPix(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKPIX, "komikpix.com", pageSize = 30, searchPageSize = 14) {
	override val listUrl = "/hentai"
}