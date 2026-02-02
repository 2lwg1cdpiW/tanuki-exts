package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken // Host error
@MangaSourceParser("STICKHORSE", "StickHorse", "es")
internal class Stickhorse(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.STICKHORSE, "www.stickhorse.cl") {
	override val postReq = true
}
