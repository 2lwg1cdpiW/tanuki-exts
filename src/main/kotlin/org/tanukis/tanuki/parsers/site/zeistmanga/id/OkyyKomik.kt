package org.tanukis.tanuki.parsers.site.zeistmanga.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("OKYYKOMIK", "OkyyKomik", "id")
internal class OkyyKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.OKYYKOMIK, "www.okyykomik.my.id")
