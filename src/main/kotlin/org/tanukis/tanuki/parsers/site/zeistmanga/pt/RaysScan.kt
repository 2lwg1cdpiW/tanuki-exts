package org.tanukis.tanuki.parsers.site.zeistmanga.pt

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.model.MangaTag
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("RAYSSCAN", "RaysScan", "pt")
internal class RaysScan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.RAYSSCAN, "raysscan.blogspot.com") {

	override suspend fun getFilterOptions() = super.getFilterOptions().copy(
		availableStates = emptySet(),
	)

	override suspend fun fetchAvailableTags(): Set<MangaTag> = emptySet()
}


