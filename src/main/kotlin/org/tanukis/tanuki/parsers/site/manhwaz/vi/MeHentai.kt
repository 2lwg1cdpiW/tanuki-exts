package org.tanukis.tanuki.parsers.site.manhwaz.vi

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.manhwaz.ManhwaZ

@MangaSourceParser("MEHENTAI", "MeHentai", "vi", ContentType.HENTAI)
internal class MeHentai(context: MangaLoaderContext) :
	ManhwaZ(context, MangaParserSource.MEHENTAI, "mehentai.tv") {

	override val searchPath = "tim-kiem"
	override val tagPath = "the-loai"
}
