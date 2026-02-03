package org.tanukis.tanuki.parsers.site.madara.ko

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("RAWDEX", "RawDex", "ko", ContentType.HENTAI)
internal class RawDex(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWDEX, "rawdex.net", 40) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
