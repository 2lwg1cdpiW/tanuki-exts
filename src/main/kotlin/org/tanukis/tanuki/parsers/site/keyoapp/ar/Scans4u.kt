package org.tanukis.tanuki.parsers.site.keyoapp.ar

import org.tanukis.tanuki.parsers.MangaLoaderContext
import org.tanukis.tanuki.parsers.MangaSourceParser
import org.tanukis.tanuki.parsers.model.MangaParserSource
import org.tanukis.tanuki.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("SCANS4U", "4uScans", "ar")
internal class Scans4u(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.SCANS4U, "4uscans.com")
