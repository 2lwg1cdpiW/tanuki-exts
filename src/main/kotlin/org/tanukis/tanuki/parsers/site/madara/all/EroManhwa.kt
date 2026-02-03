package org.tanukis.tanuki.parsers.site.madara.all

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("EROMANHWA", "EroManhwa", "", ContentType.HENTAI)
internal class EroManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EROMANHWA, "eromanhwa.org") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
