package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LICHSUBS", "LichSubs", "tr")
internal class LichSubs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LICHSUBS, "www.kuroimanga.com") {
	override val datePattern = "dd/MM/yyyy"
}
