package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("FOXWHITE", "FoxWhite", "pt")
internal class FoxWhite(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FOXWHITE, "foxwhite.com.br")
