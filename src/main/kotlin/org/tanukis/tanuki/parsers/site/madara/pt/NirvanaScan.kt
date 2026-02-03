package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("NIRVANASCAN", "NirvanaScan", "pt")
internal class NirvanaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIRVANASCAN, "nirvanascan.com")
