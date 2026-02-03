package org.tanukis.tanuki.parsers.site.onemanga.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.onemanga.OneMangaParser
import org.tanukis.tanuki.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("CENTURYBOYS20TH", "20ThCenturyBoys", "fr")
internal class CenturyBoys20Th(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.CENTURYBOYS20TH, "20thcenturyboys.fr")
