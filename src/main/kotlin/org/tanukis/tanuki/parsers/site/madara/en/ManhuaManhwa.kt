package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAMANHWA", "ManhuaManhwa", "en")
internal class ManhuaManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAMANHWA, "manhuamanhwa.com") {
	override val datePattern = "MM/dd/yyyy"
}
