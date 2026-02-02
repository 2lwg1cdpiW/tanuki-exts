package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("KENHUAV2SCANK", "Kenhuav2Scan", "es")
internal class Kenhuav2Scan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KENHUAV2SCANK, "kenhuav2scan.com")
