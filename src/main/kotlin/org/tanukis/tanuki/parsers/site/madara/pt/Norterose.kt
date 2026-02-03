package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("NORTEROSE", "Norterose", "pt")
internal class Norterose(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NORTEROSE, "norterose.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
	override val withoutAjax = true
}
