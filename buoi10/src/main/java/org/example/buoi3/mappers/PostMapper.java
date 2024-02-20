package org.example.buoi3.mappers;

import org.example.buoi3.inputs.PostDataInput;
import org.example.buoi3.models.Post;
import org.example.buoi3.outputs.PostDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PostMapper {

    @Mappings({
            @Mapping(target = "content",source = "input.content"),
            @Mapping(target = "id",source = "id")
    })
    Post toPostCreate(PostDataInput input,Long id);

    @Mappings({
            @Mapping(target = "content",source = "input.content"),
            @Mapping(target = "contentOriginal",source = "inputPost.content"),
            @Mapping(target = "idOriginal",source = "inputPost.id"),
            @Mapping(target = "id",source = "id"),
    })
    Post toPostShare(PostDataInput input,Post inputPost,Long id);

    @Mappings({
            @Mapping(target = "content",source = "content"),
            @Mapping(target = "isPost",source = "isPost"),
            @Mapping(target = "id",source = "id"),
    })
    PostDataOutput toPostDataOutput(Post input);
}
