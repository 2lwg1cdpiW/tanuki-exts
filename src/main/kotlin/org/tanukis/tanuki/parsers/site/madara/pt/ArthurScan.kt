package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("ARTHUR_SCAN", "ArthurScan", "pt")
internal class ArthurScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARTHUR_SCAN, "arthurscan.xyz")
