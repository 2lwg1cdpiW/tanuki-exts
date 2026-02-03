package org.tanukis.tanuki.parsers.site.likemanga.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.likemanga.LikeMangaParser

@MangaSourceParser("LIKEMANGA", "LikeManga", "en")
internal class LikeManga(context: MangaLoaderContext) :
	LikeMangaParser(context, MangaParserSource.LIKEMANGA, "likemanga.ink")
