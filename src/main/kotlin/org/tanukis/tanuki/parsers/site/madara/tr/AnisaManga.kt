package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ANISA_MANGA", "AnisaManga", "tr")
internal class AnisaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANISA_MANGA, "anisamanga.com")
