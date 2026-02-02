package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("SSREADING", "SsReading", "pt")
internal class SsReading(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SSREADING, "ssreading.com.br") {
	override val datePattern: String = "dd 'de' MMM 'de' yyyy"
}
