package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA1K", "Manga1k", "en", ContentType.HENTAI)
internal class Manga1k(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA1K, "manga1k.com", 20) {
	override val withoutAjax = true
}
