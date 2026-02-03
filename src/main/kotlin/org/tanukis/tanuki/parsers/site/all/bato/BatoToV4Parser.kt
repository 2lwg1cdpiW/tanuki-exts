package org.tanukis.tanuki.parsers.site.all.bato

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.all.BatoParser

@MangaSourceParser("BATOTOV4", "Bato.To v4")
internal class BatoToV4Parser(context: MangaLoaderContext):
	BatoParser(context, MangaParserSource.BATOTOV4, "bato.si") {

	override val configKeyDomain = ConfigKey.Domain(
		"bato.si",
		"battwo.com",
		"bato.to",
		"bato.ing",
	)
}
