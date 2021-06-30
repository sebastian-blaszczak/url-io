package io.url.service

import io.url.model.dto.UrlDTO

interface UrlService {

    fun create(urlDTO: UrlDTO): Long
}