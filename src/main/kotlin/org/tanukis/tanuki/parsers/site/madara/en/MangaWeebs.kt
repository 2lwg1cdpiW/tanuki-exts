package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWEEBS", "MangaWeebs", "en")
internal class MangaWeebs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWEEBS, "mangaweebs.in", pageSize = 20) {
	override val datePattern = "dd MMMM HH:mm"
}
