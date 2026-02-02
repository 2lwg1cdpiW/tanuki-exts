package org.tanukis.tanuki.parsers.config

public interface MangaSourceConfig {

	public operator fun <T> get(key: ConfigKey<T>): T
}
