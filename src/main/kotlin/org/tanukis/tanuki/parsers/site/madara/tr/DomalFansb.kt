package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("DOMALFANSB", "DomalFansub", "tr")
internal class DomalFansb(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOMALFANSB, "domalfansb.com.tr") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "manga-turleri/"
}
