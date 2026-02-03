package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_EN", "MangaFire English", "en")
internal class MangaFireEn(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_EN, "en")
