package com.example.springboot_basic.web;

import com.example.springboot_basic.service.posts.PostsService;
import com.example.springboot_basic.web.dto.PostsResponseDto;
import com.example.springboot_basic.web.dto.PostsSaveRequestDto;
import com.example.springboot_basic.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long Update(@PathVariable("id") Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable("id") Long id){
        return postsService.findById(id);
    }
}
