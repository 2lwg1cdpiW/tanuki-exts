package org.tanukis.tanuki.parsers.site.madara.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SCANTRADVF", "Scantrad-Vf", "fr")
internal class ScantradVf(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANTRADVF, "scantrad-vf.me") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "genre/"
}
