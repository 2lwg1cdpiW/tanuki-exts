package org.tanukis.tanuki.parsers.site.heancms.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.*
import org.tanukis.tanuki.parsers.site.heancms.HeanCms

@MangaSourceParser("OMEGASCANS", "OmegaScans", "en", ContentType.HENTAI)
internal class OmegaScans(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.OMEGASCANS, "omegascans.org")
