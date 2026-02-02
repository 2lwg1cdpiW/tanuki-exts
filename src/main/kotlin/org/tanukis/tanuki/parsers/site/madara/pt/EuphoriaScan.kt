package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("EUPHORIASCAN", "EuphoriaScan", "pt", ContentType.HENTAI)
internal class EuphoriaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EUPHORIASCAN, "euphoriascan.com", 10) {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
}
