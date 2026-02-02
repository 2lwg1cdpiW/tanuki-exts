package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("DUCKMANGA", "DuckManga", "en", ContentType.HENTAI)
internal class DuckManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DUCKMANGA, "duckmanga.com", 20)
