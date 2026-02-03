package org.tanukis.tanuki.parsers.site.natsu.ja

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.natsu.NatsuParser

@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
    NatsuParser(context, MangaParserSource.RAWKUMA, 24) {
    override val configKeyDomain = ConfigKey.Domain("rawkuma.net")
}
