package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("YONABAR", "YonaBar", "ar")
internal class YonaBar(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YONABAR, "yonabar.xyz", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "yaoi/"
}
