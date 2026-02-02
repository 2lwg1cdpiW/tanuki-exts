package org.tanukis.tanuki.parsers

import org.junit.jupiter.params.provider.EnumSource
import org.tanukis.tanuki.parsers.model.MangaParserSource

// Change 'names' to test specified parsers
@EnumSource(MangaParserSource::class, names = [], mode = EnumSource.Mode.INCLUDE)
internal annotation class MangaSources
