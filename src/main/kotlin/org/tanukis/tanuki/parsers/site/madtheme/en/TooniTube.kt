package org.tanukis.tanuki.parsers.site.madtheme.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("TOONITUBE", "TooniTube", "en", ContentType.HENTAI)
internal class TooniTube(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.TOONITUBE, "toonitube.com") {
	override val selectDesc = "div.summary div.section-body p.content"
}
