package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAACTION", "MangaAction", "en")
internal class MangaAction(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAACTION, "mangaaction.com")
