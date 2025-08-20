package com.example.pif.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.PostVO;
import com.example.pif.service.HeartService;
import com.example.pif.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pif/post/")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    HeartService heartService;

    @PostMapping("/register")
    public void registerPost(@RequestBody PostVO postVO) {
        postService.registerPost(postVO);
        System.out.println("게시글 등록완료");
    }

    @GetMapping("/getlist")
    public List<PostVO> getPostList(@RequestParam("p_public") String p_public) {
        List<PostVO> post = postService.getPostList(p_public);
        System.out.println("게시글 불러오기 성공");
        log.info("게시글 불러오기 성공: {}", post);
        return post;
    }

    @PostMapping("/modify")
    public void ModifyPost(@RequestBody PostVO postVO) {
        postService.updatePost(postVO);
        System.out.println("게시글 수정완료");
        log.info("게시글 불러오기 성공: {}", postVO);

    }

    @PostMapping("/delete")
    public void deletePost(@RequestParam("p_num") Integer p_num) {
        System.out.println("게시글 삭제완료");
        postService.deletePost(p_num);
    }

    @GetMapping("/getMyCount")
    public Integer getMyCount(@RequestParam("p_id") String p_id) {
        System.out.println("게시글 개수 불러오기 성공");
        return postService.getMyCount(p_id);
    }

    @GetMapping("/getPostTop")
    public List<PostVO> getPostTop() {
        List<PostVO> post = postService.getPostTop();
        System.out.println("게시글 불러오기 성공");
        log.info("게시글 불러오기 성공: {}", post);
        return post;
    }

    @GetMapping("/getMyPost")
    public List<PostVO> getMyPost(@RequestParam("p_id") String p_id) {
        List<PostVO> post = postService.getMyPost(p_id);
        System.out.println("게시글 불러오기 성공");
        log.info("게시글 불러오기 성공: {}", post);
        return post;
    }

    @GetMapping("/getsearch")
    public List<PostVO> getSearchPost(@RequestParam("p_content") String p_content) {
        return postService.getSearchPost(p_content);
    }

}
