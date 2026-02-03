package org.tanukis.tanuki.parsers.site.onemanga.fr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("SCANJUJUTSUKAISEN", "ScanJujutsuKaisen", "fr")
internal class ScanJujutsuKaisen(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.SCANJUJUTSUKAISEN, "scanjujutsukaisen.com")
