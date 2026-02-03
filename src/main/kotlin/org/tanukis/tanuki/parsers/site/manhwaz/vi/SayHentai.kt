package org.tanukis.tanuki.parsers.site.manhwaz.vi

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.manhwaz.ManhwaZ

@MangaSourceParser("SAYHENTAI", "SayHentai", "vi", ContentType.HENTAI)
internal class SayHentai(context: MangaLoaderContext) :
	ManhwaZ(context, MangaParserSource.SAYHENTAI, "sayhentai.live")
