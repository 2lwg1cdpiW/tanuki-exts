package org.tanukis.tanuki.parsers.site.iken.en

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.iken.IkenParser

@MangaSourceParser("HIVECOMIC", "HiveComic", "en")
internal class HiveComic(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.HIVECOMIC, "hivetoons.org", 18, true)
