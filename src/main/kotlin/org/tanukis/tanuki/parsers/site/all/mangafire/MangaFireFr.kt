package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_FR", "MangaFire French", "fr")
internal class MangaFireFr(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_FR, "fr")
