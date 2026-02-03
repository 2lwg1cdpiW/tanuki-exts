package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ONLYMANHWA", "OnlyManhwa", "en")
internal class OnlyManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ONLYMANHWA, "onlymanhwa.org") {
	override val listUrl = "manhwa/"
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
