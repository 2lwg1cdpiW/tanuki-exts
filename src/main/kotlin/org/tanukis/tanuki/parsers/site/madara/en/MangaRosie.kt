package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAROSIE", "Toon69", "en")
internal class MangaRosie(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROSIE, "toon69.com", pageSize = 16) {
	override val datePattern = "MMMM dd, yyyy"
}
