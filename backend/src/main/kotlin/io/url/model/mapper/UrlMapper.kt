package io.url.model.mapper

import io.url.model.domain.Url
import io.url.model.dto.UrlDTO
import org.mapstruct.Mapper


@Mapper
interface UrlMapper {
    
    fun mapToDto(url: Url): UrlDTO

    fun mapToModel(urlDTO: UrlDTO): Url

}