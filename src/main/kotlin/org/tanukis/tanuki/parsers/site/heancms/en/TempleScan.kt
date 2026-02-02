package org.tanukis.tanuki.parsers.site.heancms.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.heancms.HeanCms

@Broken("Not dead, changed template")
@MangaSourceParser("TEMPLESCAN", "TempleScan", "en")
internal class TempleScan(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.TEMPLESCAN, "templetoons.com") {
	override val pathManga = "comic"

	override val apiPath: String
		get() = "$domain/api"
}
