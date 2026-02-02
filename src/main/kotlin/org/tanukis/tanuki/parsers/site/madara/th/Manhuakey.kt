package org.tanukis.tanuki.parsers.site.madara.th

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken
import java.util.*

@Broken
@MangaSourceParser("MANHUAKEY", "ManhuaKey", "th")
internal class Manhuakey(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAKEY, "www.manhuakey.com", 10) {
	override val datePattern: String = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
