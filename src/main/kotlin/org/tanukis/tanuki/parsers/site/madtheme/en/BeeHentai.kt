package org.tanukis.tanuki.parsers.site.madtheme.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("BEEHENTAI", "BeeHentai", "en", ContentType.HENTAI)
internal class BeeHentai(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.BEEHENTAI, "beehentai.com") {
	override val selectDesc = "div.section-body"
}
