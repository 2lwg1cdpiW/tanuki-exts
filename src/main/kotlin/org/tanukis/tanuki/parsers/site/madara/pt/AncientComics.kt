package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ANCIENTCOMICS", "AncientComics", "pt")
internal class AncientComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANCIENTCOMICS, "ancientcomics.com.br") {
	override val datePattern: String = "dd/MM/yyyy"
	override val withoutAjax = true
}
