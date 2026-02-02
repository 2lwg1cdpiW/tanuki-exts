package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("VALKYRIESCAN", "ValkyrieScan", "pt", ContentType.HENTAI)
internal class ValkyrieScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VALKYRIESCAN, "valkyriescan.com", pageSize = 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
