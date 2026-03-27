package com.example.demo.controller;

import com.example.demo.controller.dto.CreatePostRequest;
import com.example.demo.controller.dto.PostResponse;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 게시글 생성
    @PostMapping("/api/posts")
    String creatPost(@RequestBody CreatePostRequest request){
        System.out.println(request);

        PostResponse response = postService.save(request);

        return "";
    }



}
