package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAPEAK", "MangaPeak", "ar")
internal class MangaPeak(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAPEAK, "mangapeak.org")
