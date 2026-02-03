package org.tanukis.tanuki.parsers.site.ru.multichan

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.MangaParserSource

@MangaSourceParser("MANGACHAN", "Манга-тян", "ru")
internal class MangaChanParser(context: MangaLoaderContext) : ChanParser(context, MangaParserSource.MANGACHAN) {
	override val configKeyDomain = ConfigKey.Domain("manga-chan.me")
}
