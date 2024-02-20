package org.example.buoi3.services;

import org.example.buoi3.inputs.PostDataInput;
import org.example.buoi3.outputs.PostDataOutput;

public interface PostService {
    PostDataOutput createPost(PostDataInput input,Long idUserPost);
    PostDataOutput sharePost(PostDataInput input, Long idPost,Long idUserShare);
    PostDataOutput getPost(Long id);
}
