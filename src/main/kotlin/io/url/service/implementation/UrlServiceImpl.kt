package io.url.service.implementation

import io.url.dao.UrlDAO
import io.url.model.dto.UrlDTO
import io.url.model.mapper.UrlMapper
import io.url.service.UrlService
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
class UrlServiceImpl(private val urlDAO: UrlDAO) : UrlService {

    override fun create(urlDTO: UrlDTO): Long {
        val url = mapper.mapToModel(urlDTO)
        return urlDAO.create(url)
    }

    private val mapper = Mappers.getMapper(UrlMapper::class.java)
}