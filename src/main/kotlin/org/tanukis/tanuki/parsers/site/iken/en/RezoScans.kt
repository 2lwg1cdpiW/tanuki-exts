package org.tanukis.tanuki.parsers.site.iken.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.iken.IkenParser

@MangaSourceParser("REZOSCANS", "Rezo Scans", "en")
internal class RezoScans(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.REZOSCANS, "rezoscan.org", 18, true)
