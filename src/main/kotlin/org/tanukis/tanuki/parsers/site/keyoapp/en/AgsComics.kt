package org.tanukis.tanuki.parsers.site.keyoapp.en

import org.jsoup.nodes.Element
import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser
import org.tanukis.tanuki.parsers.util.styleValueOrNull
import org.tanukis.tanuki.parsers.util.cssUrl
import org.tanukis.tanuki.parsers.Broken

@Broken // It seems like the site is dead.
@MangaSourceParser("AGSCOMICS", "AgsComics", "en")
internal class AgsComics(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.AGSCOMICS, "agrcomics.com") {

	override val cover: (Element) -> String? = { div ->
		val coverDiv = div.selectFirst("div.bg-cover[style*=background-image]")
			?: div.takeIf { it.hasClass("bg-cover") && it.hasAttr("style") }
			?: div.selectFirst("[style*=background-image]")
			?: throw Exception("Element or image url not found")

		coverDiv.styleValueOrNull("background-image")?.cssUrl()
	}

}
