package org.tanukis.tanuki.parsers.site.scan.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.scan.ScanParser

@MangaSourceParser("MANGATERRA", "MangaTerra", "pt")
internal class MangaTerra(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.MANGATERRA, "manga-terra.com")
