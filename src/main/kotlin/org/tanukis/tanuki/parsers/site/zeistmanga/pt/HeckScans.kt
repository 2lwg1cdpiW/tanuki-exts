package org.tanukis.tanuki.parsers.site.zeistmanga.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("HECKSCANS", "HeckScans", "pt")
internal class HeckScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.HECKSCANS, "heckscans.blogspot.com")
