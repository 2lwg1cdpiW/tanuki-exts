package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("PORTALYAOI", "PortalYaoi", "pt", ContentType.HENTAI)
internal class PortalYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PORTALYAOI, "portalyaoi.com", 10) {
	override val tagPrefix = "genero/"
	override val datePattern: String = "dd/MM"
}
