package org.tanukis.tanuki.parsers.site.gattsu.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.gattsu.GattsuParser

@MangaSourceParser("HENTAITOKYO", "HentaiTokyo", "pt", ContentType.HENTAI)
internal class HentaiTokyo(context: MangaLoaderContext) :
	GattsuParser(context, MangaParserSource.HENTAITOKYO, "hentaitokyo.net") {
	override val tagUrl = "tags"
}
