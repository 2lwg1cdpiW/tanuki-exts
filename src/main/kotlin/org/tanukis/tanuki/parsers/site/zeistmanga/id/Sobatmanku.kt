package org.tanukis.tanuki.parsers.site.zeistmanga.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SOBATMANKU", "Sobatmanku", "id")
internal class Sobatmanku(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SOBATMANKU, "www.sobatmanku19.cab")
