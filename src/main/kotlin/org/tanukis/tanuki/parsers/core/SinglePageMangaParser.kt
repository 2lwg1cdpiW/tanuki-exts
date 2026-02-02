package org.tanukis.tanuki.parsers.core

import org.tanukis.tanuki.parsers.InternalParsersApi
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.model.Manga
import org.tanukis.tanuki.parsers.model.MangaListFilter
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.model.SortOrder

@InternalParsersApi
public abstract class SinglePageMangaParser(
	context: MangaLoaderContext,
	source: MangaParserSource,
) : AbstractMangaParser(context, source) {

	final override suspend fun getList(offset: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		if (offset > 0) {
			return emptyList()
		}
		return getList(order, filter)
	}

	public abstract suspend fun getList(order: SortOrder, filter: MangaListFilter): List<Manga>
}
