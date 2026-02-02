package org.tanukis.tanuki.parsers.site.madara.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAIORIGINES", "HentaiOrigines", "fr", ContentType.HENTAI)
internal class HentaiOrigines(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIORIGINES, "hentai-origines.fr")
