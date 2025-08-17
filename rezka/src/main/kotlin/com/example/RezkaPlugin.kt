package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.utils.ExtractorLink

@CloudstreamPlugin
class RezkaPlugin : Plugin() {
    override fun load(context: PluginContext) {
        registerMainAPI(RezkaProvider())
    }
}

class RezkaProvider : MainAPI() {
    override var mainUrl = "https://rezka.ua.org"
    override var name = "Rezka"
    override var lang = "ru"
    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )

    // Поиск (НЕ РАБОТАЕТ, только пример)
    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    // Информация о фильме (НЕ РАБОТАЕТ, только пример)
    override suspend fun load(url: String): LoadResponse? {
        return null
    }

    // Получение ссылок на видео (НЕ РАБОТАЕТ, только пример)
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return false
    }
}
