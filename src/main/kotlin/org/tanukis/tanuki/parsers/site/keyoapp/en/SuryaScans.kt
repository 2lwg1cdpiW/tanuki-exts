package org.tanukis.tanuki.parsers.site.keyoapp.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("SURYASCANS", "GenzToon", "en")
internal class SuryaScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.SURYASCANS, "genzupdates.com")
