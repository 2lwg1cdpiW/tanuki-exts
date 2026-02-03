package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("COPYPASTESCAN", "CopyPasteScan", "es")
internal class Copypastescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COPYPASTESCAN, "copypastescan.xyz", 10) {
	override val datePattern = "d MMMM, yyyy"
}
