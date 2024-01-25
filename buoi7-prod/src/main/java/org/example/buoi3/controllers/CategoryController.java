package org.example.buoi3.controllers;

import org.example.buoi3.inputs.CategoryDataInput;
import org.example.buoi3.inputs.GetListCategoryInput;
import org.example.buoi3.outputs.CategoryDataOutput;
import org.example.buoi3.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<?> getListCategory(GetListCategoryInput input){
        List<CategoryDataOutput> outputs = categoryService.getListCategory(input);
        return ResponseEntity.ok(outputs);
    }

    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody CategoryDataInput input){
        CategoryDataOutput output = categoryService.createCategory(input);
        return ResponseEntity.ok(output);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> editCategory(@RequestBody CategoryDataInput input,@PathVariable("id") Long id){
        CategoryDataOutput output = categoryService.editCategory(input,id);
        return ResponseEntity.ok(output);
    }

}
