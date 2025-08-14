package com.example.pif.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.CommentVO;
import com.example.pif.service.CommentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pif/comment/")
public class CommentController {


    @Autowired
    CommentService commentService;

    @PostMapping("/register")
    public void registerComment(@RequestBody CommentVO comment) {
        commentService.registerComment(comment);
        System.out.println("댓글 등록완료");
    }

    @GetMapping("/getlist")
    public List<CommentVO> getCommentList(@Param("c_getnum") Integer c_getnum) {
        List<CommentVO> comment = commentService.getCommentList(c_getnum);
        System.out.println("댓글 불러오기 성공");
        log.info("댓글 불러오기 성공: {}", comment);
        return comment;
    }

    @GetMapping("/getcount")
    public Integer getCount(@Param("c_getnum") Integer c_getnum) {
        System.out.println("댓글 불러오기 성공");
        return commentService.getCount(c_getnum);
    }

    @PostMapping("/modify")
    public void ModifyComment(@RequestBody CommentVO comment) {
        commentService.updateComment(comment);;
    }
    
    @PostMapping("/delete")
    public void deleteComment(@Param("c_num") Integer c_num) {
        System.out.println("댓글 삭제완료");
        commentService.deleteComment(c_num);
    }
    
}
