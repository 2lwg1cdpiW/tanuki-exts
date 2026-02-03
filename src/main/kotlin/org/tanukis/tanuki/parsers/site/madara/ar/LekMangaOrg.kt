package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("LEKMANGAORG", "LekManga.org", "ar")
internal class LekMangaOrg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEKMANGAORG, "lekmanga.org", pageSize = 10) {
	override val listUrl = "readcomics/"
}
