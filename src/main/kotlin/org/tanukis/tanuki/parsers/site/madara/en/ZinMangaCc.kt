package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ZINMANGA_CC", "ZinManga.cc", "en")
internal class ZinMangaCc(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINMANGA_CC, "zinmanga.cc")
