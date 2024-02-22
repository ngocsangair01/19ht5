package org.example.buoi3.controllers;

import org.example.buoi3.inputs.PostDataInput;
import org.example.buoi3.outputs.PostDataOutput;
import org.example.buoi3.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create/{idUser}")
    public ResponseEntity<?> createPost(@RequestBody PostDataInput postDataInput, @PathVariable("idUser") Long idUser) {
        PostDataOutput postDataOutput = postService.createPost(postDataInput, idUser);
        return ResponseEntity.ok(postDataOutput);
    }

    @PostMapping("/share/{idPost}/{idUserShare}")
    public ResponseEntity<?> sharePost(@RequestBody PostDataInput input, @PathVariable("idPost") Long idPost, @PathVariable("idUserShare") Long idUserShare) {
        PostDataOutput postDataOutput = postService.sharePost(input,idPost,idUserShare);
        return ResponseEntity.ok(postDataOutput);
    }

    @GetMapping("{idPost}")
    public ResponseEntity<?> getPost(@PathVariable("idPost") Long idPost) {
        PostDataOutput postDataOutput = postService.getPost(idPost);
        return ResponseEntity.ok(postDataOutput);
    }

}
