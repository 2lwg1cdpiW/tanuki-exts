package org.tanukis.tanuki.parsers.site.all.mangafire

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_ESLA", "MangaFire Spanish (Latim)", "es")
internal class MangaFireEsLa(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_ESLA, "es-la")
