package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("CRYSTALSCAN", "CrystalComics", "pt")
internal class CrystalScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CRYSTALSCAN, "crystalcomics.com")

