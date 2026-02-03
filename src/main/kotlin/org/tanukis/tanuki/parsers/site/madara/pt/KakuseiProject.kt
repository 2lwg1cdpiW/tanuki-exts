package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("KAKUSEIPROJECT", "KakuseiProject", "pt")
internal class KakuseiProject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KAKUSEIPROJECT, "kakuseiproject.com", 10)
