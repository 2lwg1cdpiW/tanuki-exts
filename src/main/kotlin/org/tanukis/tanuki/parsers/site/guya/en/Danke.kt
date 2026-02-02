package org.tanukis.tanuki.parsers.site.guya.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.guya.GuyaParser

@MangaSourceParser("DANKE", "DankeFursLesen", "en")
internal class Danke(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.DANKE, "danke.moe")
