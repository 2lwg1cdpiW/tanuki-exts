package org.tanukis.tanuki.parsers.site.vmp.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.vmp.VmpParser

@MangaSourceParser("VERMANGASPORNO", "VerMangasPorno", "es", ContentType.HENTAI)
internal class VerMangasPorno(context: MangaLoaderContext) :
	VmpParser(context, MangaParserSource.VERMANGASPORNO, "vermangasporno.com")
