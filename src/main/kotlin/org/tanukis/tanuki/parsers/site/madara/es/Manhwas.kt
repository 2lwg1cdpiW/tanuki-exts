package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAS_ES", "Manhwas.es", "es", ContentType.HENTAI)
internal class Manhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAS_ES, "manhwas.es", 30)
