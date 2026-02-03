package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGANANQUIM", "MangaNanquim", "pt")
internal class MangaNanquim(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGANANQUIM, "mangananquim.site", 10) {
	override val datePattern: String = "d 'de' MMMM 'de' yyyy"
	override val listUrl = "ler-manga/"
	override val tagPrefix = "manga-genero/"
}
