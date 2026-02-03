package org.tanukis.tanuki.parsers.site.zeistmanga.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YOKAITEAM", "YokaiTeam", "ar")
internal class YokaiTeam(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YOKAITEAM, "yokai-team.blogspot.com")
