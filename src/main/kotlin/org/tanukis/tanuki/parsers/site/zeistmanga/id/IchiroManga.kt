package org.tanukis.tanuki.parsers.site.zeistmanga.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("ICHIROMANGA", "IchiroManga", "id")
internal class IchiroManga(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ICHIROMANGA, "ichiromanga.my.id")
