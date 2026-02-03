package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("NVMANGA", "NvManga", "en")
internal class NvManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NVMANGA, "1manhwa.com") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "genre/"
	override val listUrl = "webtoon/"
}
