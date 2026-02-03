package org.tanukis.tanuki.parsers.site.madara.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser
import org.tanukis.tanuki.parsers.Broken

@Broken // It has become obsolete and has been replaced by the new VyManga parser.
@MangaSourceParser("VYVYMANGA", "VyvyManga", "en")
internal class VyvyManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VYVYMANGA, "vyvymanga.org")
