package org.tanukis.tanuki.parsers.site.madara.vi

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.madara.MadaraParser

@MangaSourceParser("TRUYENTRANHFULL", "Truyện Tranh Full", "vi")
internal class TruyenTranhFull(context: MangaLoaderContext) :
    MadaraParser(context, MangaParserSource.TRUYENTRANHFULL, "truyentranhfull.net", 20) {
    override val listUrl = "truyen-tranh/"
    override val tagPrefix = "the-loai/"
    override val datePattern = "dd/MM/yyyy"
}
