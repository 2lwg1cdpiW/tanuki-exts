package org.tanukis.tanuki.parsers.site.keyoapp.fr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("ANTEIKUSCAN", "AnteikuScan", "fr")
internal class AnteikuScan(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ANTEIKUSCAN, "anteikuscan.fr")
