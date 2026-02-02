package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("OLAOE", "Olaoe", "ar")
internal class Olaoe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.OLAOE, "olaoe.cyou") {
	override val datePattern = "dd-MM-yyyy"
	override val tagPrefix = "/شوجو"
	override val listUrl = "works/"
}
