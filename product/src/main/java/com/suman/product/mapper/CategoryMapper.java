package com.suman.product.mapper;

import com.suman.product.dto.CategoryDTO;
import com.suman.product.entity.Category;

public class CategoryMapper {

    public static Category toCategoryEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return category;
    }

    public  static CategoryDTO toCategoryDTO(Category category){
        if(category == null) return null;
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
}
