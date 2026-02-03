package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("BURNINGSCANS", "BurningScans", "pt")
internal class BurningScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BURNINGSCANS, "burningscans.com") {
	override val datePattern = "dd/MM/yyyy"
}
