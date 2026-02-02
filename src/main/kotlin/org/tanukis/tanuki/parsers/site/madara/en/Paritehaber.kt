package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("PARITEHABER", "Paritehaber", "en", ContentType.HENTAI)
internal class Paritehaber(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PARITEHABER, "www.paritehaber.com", 10)
