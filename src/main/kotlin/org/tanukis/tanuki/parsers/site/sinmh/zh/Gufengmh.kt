package org.tanukis.tanuki.parsers.site.sinmh.zh

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.sinmh.SinmhParser
import org.tanukis.tanuki.parsers.Broken

@Broken
@MangaSourceParser("GUFENGMH", "Gufengmh", "zh")
internal class Gufengmh(context: MangaLoaderContext) :
	SinmhParser(context, MangaParserSource.GUFENGMH, "www.gufengmh.com")
