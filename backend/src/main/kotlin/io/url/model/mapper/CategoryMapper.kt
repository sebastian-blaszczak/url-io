package io.url.model.mapper

import io.url.model.domain.Category
import io.url.model.dto.CategoryDTO
import org.mapstruct.Mapper

@Mapper
interface CategoryMapper {

    fun convertToDto(category: Category): CategoryDTO

    fun convertToModel(categoryDTO: CategoryDTO): Category
    
}