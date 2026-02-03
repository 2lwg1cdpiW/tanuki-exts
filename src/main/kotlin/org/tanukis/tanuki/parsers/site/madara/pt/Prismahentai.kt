package org.tanukis.tanuki.parsers.site.madara.pt

import org.tanukis.tanuki.parsers.Broken
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PRISMA_HENTAI", "PrismaHentai", "pt", ContentType.HENTAI)
internal class Prismahentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PRISMA_HENTAI, "prismahentai.com", 18)
