package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("DECCALSCANS", "DeccalScans", "tr", ContentType.HENTAI)
internal class DeccalScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DECCALSCANS, "fuchscans.com") {
	override val tagPrefix = "turler/"
}