package org.tanukis.tanuki.parsers.site.ru.rulib

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource

@MangaSourceParser("YAOILIB", "SlashLib", "ru")
internal class SlashLibParser(context: MangaLoaderContext) : LibSocialParser(
	context = context,
	source = MangaParserSource.YAOILIB,
	siteId = 2,
	siteDomains = arrayOf("v2.slashlib.me"),
)
