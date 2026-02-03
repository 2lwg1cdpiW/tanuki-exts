package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANHUABUG", "ManhuaBug", "th")
internal class Manhuabug(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUABUG, "www.manhuabug.com", 10) {
	override val datePattern: String = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
