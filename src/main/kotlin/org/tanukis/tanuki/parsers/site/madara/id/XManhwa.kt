package org.tanukis.tanuki.parsers.site.madara.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("XMANHWA", "XManhwa", "id", ContentType.HENTAI)
internal class XManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.XMANHWA, "www.manhwaden.com", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
