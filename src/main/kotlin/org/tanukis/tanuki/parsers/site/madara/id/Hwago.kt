package org.tanukis.tanuki.parsers.site.madara.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HWAGO", "Hwago", "id")
internal class Hwago(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HWAGO, "hwago01.xyz") {
	override val datePattern = "d MMMM yyyy"
}
