package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("GEDECOMIX", "GedeComix", "en", ContentType.HENTAI)
internal class GedeComix(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GEDECOMIX, "gedecomix.com", 18) {
	override val tagPrefix = "comics-tag/"
	override val listUrl = "porncomic/"
}
