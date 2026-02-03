package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_MANHUA", "MangaManhua", "en")
internal class MangaManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_MANHUA, "mangaonlineteam.com", pageSize = 10)
