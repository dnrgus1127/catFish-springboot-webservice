package com.spring.catfish.web;


import com.spring.catfish.service.PostsService;
import com.spring.catfish.web.dto.PostsResponseDto;
import com.spring.catfish.web.dto.PostsSaveRequestDto;
import com.spring.catfish.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") // 게시글 수정
    public long update(@PathVariable Long id, @RequestParam PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}") // 게시글 조회
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }
}
