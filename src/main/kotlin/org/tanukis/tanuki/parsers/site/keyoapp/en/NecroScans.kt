package org.tanukis.tanuki.parsers.site.keyoapp.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("NECROSCANS", "NecroScans", "en")
internal class NecroScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.NECROSCANS, "necroscans.com")
