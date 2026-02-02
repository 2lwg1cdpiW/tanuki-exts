package org.tanukis.tanuki.parsers.site.animebootstrap.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.animebootstrap.AnimeBootstrapParser

@MangaSourceParser("NEUMANGA", "NeuManga.xyz", "id")
internal class NeuManga(context: MangaLoaderContext) :
	AnimeBootstrapParser(context, MangaParserSource.NEUMANGA, "neumanga.xyz")
