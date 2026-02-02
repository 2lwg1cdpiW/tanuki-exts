package org.tanukis.tanuki.parsers.site.mmrcms.id

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("KOMIKID", "KomikId", "id")
internal class KomikId(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.KOMIKID, "komiku.org") {
	override val selectState = "dt:contains(Status)"
	override val selectAlt = "dt:contains(Other names)"
	override val selectAut = "dt:contains(Author(s))"
	override val selectTag = "dt:contains(Categories)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
