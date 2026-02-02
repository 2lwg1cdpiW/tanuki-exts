package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("IMPERIOSCANS", "ImperioScans", "pt")
internal class ImperioScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPERIOSCANS, "imperioscans.com.br") {
	override val datePattern: String = "dd/MM/yyyy"
}
