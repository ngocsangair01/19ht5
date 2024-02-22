package org.example.buoi3.services.imp;

import org.example.buoi3.exceptions.NotFoundException;
import org.example.buoi3.inputs.PostDataInput;
import org.example.buoi3.mappers.PostMapper;
import org.example.buoi3.mappers.UserMapper;
import org.example.buoi3.models.Post;
import org.example.buoi3.models.User;
import org.example.buoi3.outputs.PostDataOutput;
import org.example.buoi3.outputs.PostOriginal;
import org.example.buoi3.outputs.UserDataOutput;
import org.example.buoi3.repositories.PostRepository;
import org.example.buoi3.repositories.UserRepository;
import org.example.buoi3.services.PostService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImp implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public PostServiceImp(PostRepository postRepository, PostMapper postMapper, UserRepository userRepository, UserMapper userMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public PostDataOutput createPost(PostDataInput input, Long idUserPost) {
        // Map tu input vao model
        Post post = postMapper.toPostCreate(input, null);
        User user = userRepository.findById(idUserPost).get();
        post.setUser(user);
        post.setIsPost(true);

        // save model vao database
        Post temp = postRepository.save(post);

        // map tu model ra output
        PostDataOutput output = getPost(temp.getId());


        return output;
    }

    @Override
    public PostDataOutput sharePost(PostDataInput input, Long idPost, Long idUserShare) {
        // map input vao model
        Post original = postRepository.findById(idPost).get();
        Long idUserOriginal = original.getUser().getId();
        Post post = postMapper.toPostShare(input, original, null);
        post.setIdUserOriginal(idUserOriginal);
        User userShare = userRepository.findById(idUserShare).get();
        post.setUser(userShare);
        post.setIsPost(false);
        // save model vao database
        Post postShare = postRepository.save(post);
        // map tu model ra output
        PostDataOutput postDataOutput = getPost(postShare.getId());
//        UserDataOutput userShareResult = new UserDataOutput(userShare.getName(), userShare.getAvatar());
//        postDataOutput.setUser(userShareResult);
//        UserDataOutput userOriginal = new UserDataOutput(userRepository.findById(idUserOriginal).get().getName(), userRepository.findById(idUserOriginal).get().getAvatar());
//        PostOriginal postOriginal = new PostOriginal(original.getContent(), original.getId(), userOriginal);
//        postDataOutput.setPostOriginal(postOriginal);
        return postDataOutput;
    }

    @Override
    public PostDataOutput getPost(Long id) {
        Optional<Post> postCheck = postRepository.findById(id);
        if (postCheck.isEmpty()){
            throw new NotFoundException("Post khong ton tai");
        }
        Post post = postCheck.get();
        if (post.getIdOriginal()==null){
            return postMapper.toPostDataOutput(post);
        }
        Post temp = postRepository.findById(post.getIdOriginal()).get();
        User user = temp.getUser();
        UserDataOutput userDataOutput = userMapper.toUserDataOutput(user);
        PostOriginal postOriginal = new PostOriginal(temp.getContent(), temp.getId(), userDataOutput);
        PostDataOutput postDataOutput = new PostDataOutput(post.getContent(), id, userDataOutput, postOriginal, post.getIsPost());
        return postDataOutput;
    }
}