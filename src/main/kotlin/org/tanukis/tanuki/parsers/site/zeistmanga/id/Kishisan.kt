package org.tanukis.tanuki.parsers.site.zeistmanga.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@Broken
@MangaSourceParser("KISHISAN", "Kishisan", "id")
internal class Kishisan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.KISHISAN, "www.kishisan.site")
