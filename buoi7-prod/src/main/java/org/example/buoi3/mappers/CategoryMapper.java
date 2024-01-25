package org.example.buoi3.mappers;

import org.example.buoi3.inputs.CategoryDataInput;
import org.example.buoi3.models.Category;
import org.example.buoi3.outputs.CategoryDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //target: tạo mới + sửa category => target cuối cùng là 1 đối tượng Category => nếu truyền id thì là sửa, nếu không truyền id thì là thêm mới

    @Mappings({
            @Mapping(target = "name", source = "input.name"),
            @Mapping(target = "id",source = "id")
    })
    Category toCategory(CategoryDataInput input, Long id);


    @Mappings({
            @Mapping(target = "id",source = "category.id"),
            @Mapping(target = "name",source = "category.name")
    })
    CategoryDataOutput toCategoryDataOutput(Category category);

}
