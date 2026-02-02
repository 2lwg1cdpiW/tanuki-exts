package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("INMORALNOFANSUB", "InmoralNoFansub", "es")
internal class InmoralNoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INMORALNOFANSUB, "inmoralnofansub.xyz") {
	override val datePattern = "dd/MM/yyyy"
}
