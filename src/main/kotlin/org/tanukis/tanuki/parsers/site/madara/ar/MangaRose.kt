package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROSE", "MangaRose", "ar")
internal class MangaRose(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROSE, "mangarose.net", pageSize = 20)
