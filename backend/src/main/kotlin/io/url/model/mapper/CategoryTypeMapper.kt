package io.url.model.mapper

import io.url.model.domain.CategoryType
import io.url.model.dto.CategoryTypeDTO
import org.mapstruct.Mapper

@Mapper
interface CategoryTypeMapper {
    
    fun mapToDto(categoryType: CategoryType): CategoryTypeDTO

    fun mapToModel(categoryTypeDTO: CategoryTypeDTO): CategoryType

}