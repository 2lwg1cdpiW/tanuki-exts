package org.tanukis.tanuki.parsers.site.scan.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.scan.ScanParser

@MangaSourceParser("MANGABR", "MangaBr", "pt")
internal class MangaBr(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.MANGABR, "mangabr.net")
