package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("DECADENCESCANS", "DecadenceScans", "en", ContentType.HENTAI)
internal class DecadenceScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DECADENCESCANS, "reader.decadencescans.com", 10)
