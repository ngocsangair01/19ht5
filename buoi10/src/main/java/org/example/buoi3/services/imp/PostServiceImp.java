package org.example.buoi3.services.imp;

import org.example.buoi3.inputs.PostDataInput;
import org.example.buoi3.mappers.PostMapper;
import org.example.buoi3.models.Post;
import org.example.buoi3.models.User;
import org.example.buoi3.outputs.PostDataOutput;
import org.example.buoi3.outputs.PostOriginal;
import org.example.buoi3.outputs.UserDataOutput;
import org.example.buoi3.repositories.PostRepository;
import org.example.buoi3.repositories.UserRepository;
import org.example.buoi3.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;
    private final UserRepository userRepository;

    public PostServiceImp(PostRepository postRepository, PostMapper postMapper, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
        this.userRepository = userRepository;
    }

    @Override
    public PostDataOutput createPost(PostDataInput input,Long idUserPost) {
        Post post = postMapper.toPostCreate(input,null);
        User user = userRepository.findById(idUserPost).get();
        post.setUser(user);
        post.setIsPost(true);
        Post temp = postRepository.save(post);
        PostDataOutput postDataOutput = postMapper.toPostDataOutput(temp);
        UserDataOutput userDataOutput = new UserDataOutput(user.getName(), user.getAvatar());
        postDataOutput.setUser(userDataOutput);
        return postDataOutput;
    }

    @Override
    public PostDataOutput sharePost(PostDataInput input, Long idPost,Long idUserShare) {
        /// Buoc 1: gan thong tin cho original va them thong tin moi, cu the la content
        Post original = postRepository.findById(idPost).get();
        Long idUserOriginal = original.getUser().getId();
        Post post = postMapper.toPostShare(input,original,null);
        /// set xong id user original
        post.setIdUserOriginal(idUserOriginal);
        User userShare = userRepository.findById(idUserShare).get();
        post.setUser(userShare);
        post.setIsPost(false);
        /// map tu entity sang output
        //Set user truowc
        Post save = postRepository.save(post);
        PostDataOutput postDataOutput = postMapper.toPostDataOutput(save);
        UserDataOutput userShareResult = new UserDataOutput(userShare.getName(), userShare.getAvatar());
        postDataOutput.setUser(userShareResult);
        //Set Post original
        UserDataOutput userOriginal = new UserDataOutput(userRepository.findById(idUserOriginal).get().getName(),userRepository.findById(idUserOriginal).get().getAvatar());
        PostOriginal postOriginal = new PostOriginal(original.getContent(),original.getId(),userOriginal);
        postDataOutput.setPostOriginal(postOriginal);
        return postDataOutput;
    }

    @Override
    public PostDataOutput getPost(Long id) {
        return null;
    }
}
