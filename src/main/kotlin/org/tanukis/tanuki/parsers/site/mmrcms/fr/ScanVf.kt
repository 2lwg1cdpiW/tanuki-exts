package org.tanukis.tanuki.parsers.site.mmrcms.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("SCANVF", "ScanVf", "fr")
internal class ScanVf(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.SCANVF, "www.scan-vf.net") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
