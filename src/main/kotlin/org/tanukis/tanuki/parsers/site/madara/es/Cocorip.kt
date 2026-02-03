package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("COCORIP", "Cocorip", "es")
internal class Cocorip(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COCORIP, "cocorip.net", 16) {
	override val datePattern = "dd/MM/yyyy"
}
