package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RIGHTDARKSCAN", "RightDarkScan", "es")
internal class RightdarkScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RIGHTDARKSCAN, "rsdleft.com", 10)
