package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROCKTEAM", "MangaRock.team", "en")
internal class MangaRockTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROCKTEAM, "mangarockteam.com")
