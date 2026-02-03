package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGARUHU", "MangaRuhu", "tr")
internal class MangaRuhu(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARUHU, "mangaruhu.com", 16)
