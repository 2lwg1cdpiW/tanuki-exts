package org.tanukis.tanuki.parsers.model

public data class MangaComment(
    @JvmField public val id: Long,
    @JvmField public val author: String?,
    @JvmField public val content: String,
    @JvmField public val timestamp: Long,
    @JvmField public val avatarUrl: String?,
    @JvmField public val source: MangaSource,
)
