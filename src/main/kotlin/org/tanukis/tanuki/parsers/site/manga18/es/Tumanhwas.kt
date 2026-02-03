package org.tanukis.tanuki.parsers.site.manga18.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.manga18.Manga18Parser

@MangaSourceParser("TUMANHWAS", "Tumanhwas", "es", ContentType.HENTAI)
internal class Tumanhwas(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.TUMANHWAS, "tumanhwas.club") {
	override val selectTag = "div.item:contains(Géneros) div.info_value a"
	override val selectAlt = "div.item:contains(Títulos alternativos) div.info_value"
}
