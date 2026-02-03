package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("READER_EVILFLOWERS", "EvilFlowers", "en")
internal class ReaderEvilflowers(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READER_EVILFLOWERS, "evilflowers.com", pageSize = 10) {
	override val listUrl = "project/"
}
