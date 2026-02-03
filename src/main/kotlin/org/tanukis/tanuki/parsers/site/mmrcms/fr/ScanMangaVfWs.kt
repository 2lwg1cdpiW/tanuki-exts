package org.tanukis.tanuki.parsers.site.mmrcms.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("SCANMANGAVF_WS", "ScanMangaVf.ws", "fr")
internal class ScanMangaVfWs(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.SCANMANGAVF_WS, "scanmanga-vf.me") {
	override val imgUpdated = ".jpg"
	override val selectTag = "dt:contains(Genres)"
	override val selectAlt = "dt:contains(Appelé aussi)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
