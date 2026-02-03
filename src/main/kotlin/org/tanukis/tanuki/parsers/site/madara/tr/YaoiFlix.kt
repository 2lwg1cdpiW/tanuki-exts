package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIFLIX", "YaoiFlix", "tr", ContentType.HENTAI)
internal class YaoiFlix(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIFLIX, "yaoiflix.me", 16)
