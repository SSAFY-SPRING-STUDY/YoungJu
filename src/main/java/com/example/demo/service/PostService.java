package com.example.demo.service;

import com.example.demo.controller.dto.CreatePostRequest;
import com.example.demo.repository.PostRepository;
import com.example.demo.controller.dto.PostResponse;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    private final PostRepository postRepository;
    public PostResponse save(CreatePostRequest request) {
        postRepository.save
    }
}
