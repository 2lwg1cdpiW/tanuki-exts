package org.tanukis.tanuki.parsers.site.madara.tr

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("JELLYRING", "Jellyring", "tr")
internal class Jellyring(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JELLYRING, "jellyring.co")
