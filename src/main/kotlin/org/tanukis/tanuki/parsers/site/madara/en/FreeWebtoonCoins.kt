package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("FREEWEBTOONCOINS", "FreeWebtoonCoins", "en")
internal class FreeWebtoonCoins(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREEWEBTOONCOINS, "freewebtooncoins.com") {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "webtoon/"
}
