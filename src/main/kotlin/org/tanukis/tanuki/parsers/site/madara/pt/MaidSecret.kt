package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MAIDSECRET", "MaidSecret", "pt")
internal class MaidSecret(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MAIDSECRET, "maidsecret.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
