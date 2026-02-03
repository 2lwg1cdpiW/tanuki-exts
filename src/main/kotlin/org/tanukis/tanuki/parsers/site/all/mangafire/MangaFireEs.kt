package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_ES", "MangaFire Spanish", "es")
internal class MangaFireEs(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_ES, "es")
