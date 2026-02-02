package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("ASURASCANS_US", "AsuraScans.us", "en")
internal class AsuraScansUs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASURASCANS_US, "asurascans.us") {
	override val listUrl = "comics/"
	override val tagPrefix = "read-en-us-genre/"
}
