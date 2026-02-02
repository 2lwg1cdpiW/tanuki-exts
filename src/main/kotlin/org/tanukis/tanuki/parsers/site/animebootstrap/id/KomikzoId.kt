package org.tanukis.tanuki.parsers.site.animebootstrap.id

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.animebootstrap.AnimeBootstrapParser

@MangaSourceParser("KOMIKZOID", "KomikzoId", "id")
internal class KomikzoId(context: MangaLoaderContext) :
	AnimeBootstrapParser(context, MangaParserSource.KOMIKZOID, "komikzoid.id")
