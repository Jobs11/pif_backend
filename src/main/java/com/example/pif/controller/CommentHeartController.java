package com.example.pif.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.CommentHeartVO;
import com.example.pif.dto.HeartVO;
import com.example.pif.service.CommentHeartService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pif/commentheart/")
public class CommentHeartController {

    @Autowired
    CommentHeartService commentHeartService;

    @PostMapping("/register")
    public void registerHeart(@RequestBody CommentHeartVO commentHeart) {
        commentHeartService.registerHeart(commentHeart);
        System.out.println("좋아요 완료!");
    }

    @PostMapping("/delete")
    public void deleteHeart(@RequestBody CommentHeartVO commentHeart) {
        commentHeartService.deleteHeart(commentHeart);
        System.out.println("좋아요 취소!");
    }
    
    @GetMapping("/getHeart")
    public Integer getHeart(@Param("ch_id") String ch_id, @Param("ch_num") Integer ch_num) {
        return commentHeartService.getHeart(ch_id, ch_num);
    }
    
    @GetMapping("/getCount")
    public Integer getCount(@Param("ch_num") Integer ch_num) {
        return commentHeartService.getCount(ch_num);
    }
    
    @GetMapping("/getMyCount")
    public Integer getMyCount(@Param("ch_id") String ch_id) {
        return commentHeartService.getMyCount(ch_id);
    }
    
}
