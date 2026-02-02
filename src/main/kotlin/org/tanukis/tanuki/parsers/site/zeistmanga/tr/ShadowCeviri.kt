package org.tanukis.tanuki.parsers.site.zeistmanga.tr

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.ContentType
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("SHADOWCEVIRI", "ShadowCeviri", "tr", ContentType.COMICS)
internal class ShadowCeviri(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SHADOWCEVIRI, "shadowceviri.blogspot.com") {
	override val sateOngoing: String = "Devam Ediyor"
	override val sateFinished: String = "Tamamlandı"
	override val sateAbandoned: String = "Güncel"
}
