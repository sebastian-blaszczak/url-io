package io.url.useCase

import io.url.model.dto.UrlDTO

interface UrlUC {

    fun create(urlDTO: UrlDTO): Long
}