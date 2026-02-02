package org.tanukis.tanuki.parsers.site.zeistmanga.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("ARABSDOUJIN", "ArabsDoujin", "ar", ContentType.HENTAI)
internal class ArabsDoujin(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ARABSDOUJIN, "www.arabsdoujin.online")
