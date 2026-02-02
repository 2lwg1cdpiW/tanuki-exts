package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("COMICARAB", "ComicArab", "ar")
internal class ComicArab(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICARAB, "comicarab.com", pageSize = 24) {
	override val datePattern = "d MMMM، yyyy"
}
