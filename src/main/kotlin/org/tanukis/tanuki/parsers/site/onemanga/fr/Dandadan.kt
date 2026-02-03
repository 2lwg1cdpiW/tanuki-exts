package org.tanukis.tanuki.parsers.site.onemanga.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("DANDADAN", "Dandadan", "fr")
internal class Dandadan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.DANDADAN, "dandadan.fr")
