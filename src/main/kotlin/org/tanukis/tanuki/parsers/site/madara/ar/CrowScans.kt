package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("CROWSCANS", "Hadess", "ar")
internal class CrowScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CROWSCANS, "www.hadess.xyz") {
	override val datePattern = "dd MMMM، yyyy"
}
