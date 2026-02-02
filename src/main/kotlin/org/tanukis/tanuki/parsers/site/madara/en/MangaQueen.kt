package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA_QUEEN", "MangaQueen", "en")
internal class MangaQueen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_QUEEN, "mangaqueen.com", 16)
