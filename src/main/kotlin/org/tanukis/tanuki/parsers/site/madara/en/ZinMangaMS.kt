package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ZINMANGA_MS", "ZinManga.ms", "en")
internal class ZinMangaMS(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINMANGA_MS, "zinmanga.ms") {
	override val listUrl = "manga-1/"
	override val tagPrefix = "manga-genre-1/"
}
