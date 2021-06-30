package io.url.useCase.implementation

import io.url.model.dto.UrlDTO
import io.url.service.UrlService
import io.url.useCase.UrlUC
import org.springframework.stereotype.Service

@Service
class UrlUCImpl(val urlService: UrlService) : UrlUC {

    override fun create(urlDTO: UrlDTO): Long {
        return urlService.create(urlDTO)
    }
}