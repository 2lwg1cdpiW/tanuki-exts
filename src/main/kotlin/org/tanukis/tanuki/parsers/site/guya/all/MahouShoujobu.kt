package org.tanukis.tanuki.parsers.site.guya.all

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.guya.GuyaParser

@MangaSourceParser("MAHOUSHOUJOBU", "MahouShoujobu")
internal class MahouShoujobu(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.MAHOUSHOUJOBU, "mahoushoujobu.com")
