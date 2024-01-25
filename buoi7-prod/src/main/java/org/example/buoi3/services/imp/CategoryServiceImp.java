package org.example.buoi3.services.imp;

import org.example.buoi3.inputs.CategoryDataInput;
import org.example.buoi3.inputs.GetListCategoryInput;
import org.example.buoi3.mappers.CategoryMapper;
import org.example.buoi3.models.Category;
import org.example.buoi3.outputs.CategoryDataOutput;
import org.example.buoi3.repositories.CategoryRepository;
import org.example.buoi3.services.CategoryService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDataOutput> getListCategory(GetListCategoryInput input) {
        List<CategoryDataOutput> result = new ArrayList<>();
        List<Category> categories = categoryRepository.getListCategory(input.getName(), PageRequest.of(input.getPage(),input.getSize()));
        for (Category category : categories) {
            CategoryDataOutput output = new CategoryDataOutput(category.getId(), category.getName());
            result.add(output);
        }
        return result;
    }

    @Override
    public CategoryDataOutput createCategory(CategoryDataInput input) {
        Category category = categoryMapper.toCategory(input,null);
        categoryRepository.save(category);
        return categoryMapper.toCategoryDataOutput(category);
    }

    @Override
    public CategoryDataOutput editCategory(CategoryDataInput input, Long id) {
        Category category = categoryMapper.toCategory(input,id);
        categoryRepository.save(category);
        return categoryMapper.toCategoryDataOutput(category);
    }

    @Override
    public CategoryDataOutput getById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return categoryMapper.toCategoryDataOutput(category.get());
    }

    @Override
    public CategoryDataOutput deleteCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        categoryRepository.deleteById(id);
        return categoryMapper.toCategoryDataOutput(category.get());
    }
}
