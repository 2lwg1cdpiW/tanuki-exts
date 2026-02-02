package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("TREE_MANGA", "TreeManga", "en")
internal class TreeManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TREE_MANGA, "treemanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
