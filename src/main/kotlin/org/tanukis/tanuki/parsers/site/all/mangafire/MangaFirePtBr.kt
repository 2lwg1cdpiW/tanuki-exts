package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_PTBR", "MangaFire Portuguese (Brazil)", "pt")
internal class MangaFirePtBr(context: MangaLoaderContext) :
	MangaFireParser(context, MangaParserSource.MANGAFIRE_PTBR, "pt-br")
