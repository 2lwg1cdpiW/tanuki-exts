package org.tanukis.tanuki.parsers.site.keyoapp.en

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("LAIDBACKSCANS", "LaidBackScans", "en")
internal class LaidBackScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.LAIDBACKSCANS, "laidbackscans.org")
