package org.example.buoi3.mappers;

import org.example.buoi3.inputs.UserDataInput;
import org.example.buoi3.models.User;
import org.example.buoi3.outputs.UserDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(target = "name", source = "input.name"),
            @Mapping(target = "avatar", source = "input.avatar"),
            @Mapping(target = "id", source = "id")
    })
    User toUserCreate(UserDataInput input, Long id);

    @Mappings({
            @Mapping(target = "name", source = "input.name"),
            @Mapping(target = "avatar", source = "input.avatar")
    })
    UserDataOutput toUserDataOutput(User input);
}