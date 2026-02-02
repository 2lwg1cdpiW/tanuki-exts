package org.tanukis.tanuki.parsers.site.mmrcms.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("BENTOSCAN", "BentoScan", "fr")
internal class BentoScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.BENTOSCAN, "bentoscan.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val imgUpdated = ".jpg"
}
