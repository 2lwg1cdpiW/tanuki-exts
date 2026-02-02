@file:JvmName("MangaParsersUtils")

package org.tanukis.tanuki.parsers.util

import org.tanukis.tanuki.parsers.model.MangaChapter
import org.tanukis.tanuki.parsers.model.MangaListFilter
import kotlin.contracts.contract

public fun MangaListFilter?.isNullOrEmpty(): Boolean {
	contract {
		returns(false) implies (this@isNullOrEmpty != null)
	}
	return this == null || this.isEmpty()
}

public fun Collection<MangaChapter>.findById(chapterId: Long): MangaChapter? = find { x ->
	x.id == chapterId
}
