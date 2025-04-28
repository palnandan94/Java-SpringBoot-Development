package com.suman.product.service;

import com.suman.product.dto.CategoryDTO;
import com.suman.product.entity.Category;
import com.suman.product.mapper.CategoryMapper;
import com.suman.product.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    /*create category*/
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);
        return  CategoryMapper.toCategoryDTO(category);
    }

}
