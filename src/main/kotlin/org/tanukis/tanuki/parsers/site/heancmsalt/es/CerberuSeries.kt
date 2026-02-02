package org.tanukis.tanuki.parsers.site.heancmsalt.es

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.heancmsalt.HeanCmsAlt
import org.tanukis.tanuki.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("LEGIONSCANS", "CerberusSeries", "es")
internal class CerberuSeries(context: MangaLoaderContext) :
	HeanCmsAlt(context, MangaParserSource.LEGIONSCANS, "legionscans.com")
