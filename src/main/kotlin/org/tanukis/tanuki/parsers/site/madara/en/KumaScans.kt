package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("KUMASCANS", "Retsu", "en")
internal class KumaScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KUMASCANS, "retsu.org") {
	override val tagPrefix = "genre/"
}
