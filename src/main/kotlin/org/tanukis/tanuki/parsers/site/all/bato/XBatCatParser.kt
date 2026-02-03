package org.tanukis.tanuki.parsers.site.all.bato

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.BatoParser

@MangaSourceParser("XBATCAT", "XBatCat")
internal class XBatCatParser(context: MangaLoaderContext):
	BatoParser(context, MangaParserSource.XBATCAT, "xbat.si") {

	override val configKeyDomain = ConfigKey.Domain(
		"xbat.si",
		"xbat.tv",
	)
}
