package com.example.pif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pif.dto.CommentVO;
import com.example.pif.mapper.CommentMapper;

@Service
public class CommentServiceimpl implements CommentService{


    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<CommentVO> getCommentList(Integer c_getnum) {
        return commentMapper.getCommentList(c_getnum);
    }

    @Override
    public Integer getCount(Integer c_getnum) {
        return commentMapper.getCount(c_getnum);
    }

    @Override
    public void registerComment(CommentVO comment) {
        commentMapper.registerComment(comment);
    }

    @Override
    public void deleteComment(Integer c_num) {
        commentMapper.deleteComment(c_num);
    }

    @Override
    public void updateComment(CommentVO comment) {
        commentMapper.updateComment(comment);
    }

    @Override
    public Integer getMyCount(String c_id) {
        return commentMapper.getMyCount(c_id);
    }
    
}
