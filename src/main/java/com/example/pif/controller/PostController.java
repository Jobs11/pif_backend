package com.example.pif.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.PostVO;

import com.example.pif.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pif/post/")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/register")
    public void registerPost(@RequestBody PostVO postVO) {
        postService.registerPost(postVO);
        System.out.println("게시글 등록완료");
    }

    @GetMapping("/getlist")
    public List<PostVO> getPostList(@Param("p_public") String p_public) {
        List<PostVO> post = postService.getPostList(p_public);
        System.out.println("게시글 불러오기 성공");
        log.info("게시글 불러오기 성공: {}", post);
        return post;
    }


    @PostMapping("/modify")
    public void ModifyPost(@RequestBody PostVO postVO) {
        postService.updatePost(postVO);
    }
    
    @PostMapping("/delete")
    public void deletePost(@Param("p_id") String p_id) {
        System.out.println("게시글 삭제완료");
        postService.deletePost(p_id);
    }

    @GetMapping("/getMyCount")
    public Integer getMyCount(@Param("p_id") String p_id) {
        System.out.println("댓글 불러오기 성공");
        return postService.getMyCount(p_id);
    }
    
}
