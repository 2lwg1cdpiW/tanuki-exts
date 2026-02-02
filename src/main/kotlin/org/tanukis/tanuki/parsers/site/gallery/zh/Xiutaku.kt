package org.tanukis.tanuki.parsers.site.gallery.zh

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaListFilterOptions
import org.tanukis.tanuki.parsers.site.gallery.GalleryParser

@MangaSourceParser("XIUTAKU", "Xiutaku", "zh", type = ContentType.OTHER)
internal class Xiutaku(context: MangaLoaderContext) :
    GalleryParser(context, MangaParserSource.XIUTAKU, "xiutaku.com") {
    
    override suspend fun getFilterOptions():
        MangaListFilterOptions = MangaListFilterOptions(availableTags = fetchTags())

}