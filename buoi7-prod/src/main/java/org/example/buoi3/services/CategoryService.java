package org.example.buoi3.services;

import org.example.buoi3.inputs.CategoryDataInput;
import org.example.buoi3.inputs.GetListCategoryInput;
import org.example.buoi3.outputs.CategoryDataOutput;

import java.util.List;

public interface CategoryService {
    List<CategoryDataOutput> getListCategory(GetListCategoryInput input);
    CategoryDataOutput createCategory(CategoryDataInput input);
    CategoryDataOutput editCategory(CategoryDataInput input,Long id);
    CategoryDataOutput getById(Long id);
    CategoryDataOutput deleteCategory(Long id);
}
