package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_PT", "MangaFire Portuguese", "pt")
internal class MangaFirePt(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_PT, "pt")
