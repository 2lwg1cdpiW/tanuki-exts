package org.tanukis.tanuki.parsers.site.zeistmanga.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("NGAMENKOMIK", "NgamenKomik", "id")
internal class NgamenKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.NGAMENKOMIK, "ngamenkomik05.blogspot.com")
