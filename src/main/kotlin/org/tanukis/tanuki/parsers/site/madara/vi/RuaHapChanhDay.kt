package org.tanukis.tanuki.parsers.site.madara.vi

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("RUAHAPCHANHDAY", "Rùa Hấp Chanh Dây", "vi")
internal class RuaHapChanhDay(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RUAHAPCHANHDAY, "ruahapchanhday.com", 30) {
	override val datePattern = "dd/MM/yyyy"
}
