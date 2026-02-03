package org.tanukis.tanuki.parsers.site.madara.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("RAGNAROKSCANLATION", "RagnarokScanlation", "es")
internal class RagnarokScanlation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAGNAROKSCANLATION, "ragnarokscanlation.org")
