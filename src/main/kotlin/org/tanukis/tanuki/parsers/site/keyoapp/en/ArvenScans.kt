package org.tanukis.tanuki.parsers.site.keyoapp.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("ARVENSCANS", "ArvenComics", "en")
internal class ArvenScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ARVENSCANS, "arvencomics.com")
