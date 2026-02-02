package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONLINETEAM", "MangaOnlineTeam", "en")
internal class MangaOnlineTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONLINETEAM, "mangaonlineteam.com", 10)
