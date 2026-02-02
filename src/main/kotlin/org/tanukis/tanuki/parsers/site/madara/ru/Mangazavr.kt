package org.tanukis.tanuki.parsers.site.madara.ru

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAZAVR", "Mangazavr", "ru", ContentType.HENTAI)
internal class Mangazavr(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAZAVR, "mangazavr.ru") {
	override val listUrl = "/?s=&post_type=wp-manga"
	override val datePattern = "dd.MM.yyyy"
}
