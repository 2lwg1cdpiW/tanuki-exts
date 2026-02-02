package org.tanukis.tanuki.parsers.site.madara.ar

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGATIME", "MangaTime", "ar")
internal class MangaTime(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATIME, "mangatime.org") {
	override val datePattern = "d MMMM، yyyy"
}
