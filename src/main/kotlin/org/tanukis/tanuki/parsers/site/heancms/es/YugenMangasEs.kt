package org.tanukis.tanuki.parsers.site.heancms.es

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.*
import org.tanukis.tanuki.parsers.site.heancms.HeanCms

@Broken("Not dead, changed template")
@MangaSourceParser("YUGEN_MANGAS_ES", "YugenMangas.lat", "es", ContentType.HENTAI)
internal class YugenMangasEs(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.YUGEN_MANGAS_ES, "lectorikigai.acamu.net")
