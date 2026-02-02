package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("LEITORKAMISAMA", "LeitorKamisama", "pt")
internal class LeitorKamisama(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEITORKAMISAMA, "leitor.kamisama.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
