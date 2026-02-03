package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("APOLL_COMICS", "ApollComics", "es")
internal class ApollComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.APOLL_COMICS, "apollcomics.es", 10)
