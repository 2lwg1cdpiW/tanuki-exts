package org.tanukis.tanuki.parsers

import org.tanukis.tanuki.parsers.config.ConfigKey
import org.tanukis.tanuki.parsers.config.MangaSourceConfig

internal class SourceConfigMock : MangaSourceConfig {

	override fun <T> get(key: ConfigKey<T>): T = key.defaultValue
}