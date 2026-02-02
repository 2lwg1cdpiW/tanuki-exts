package org.tanukis.tanuki.parsers.site.manga18.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.manga18.Manga18Parser

@Broken
@MangaSourceParser("COMIC1000", "Comic1000", "en")
internal class Comic1000(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.COMIC1000, "comic1000.com")
