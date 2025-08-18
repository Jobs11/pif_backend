package com.example.pif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pif.dto.CommentHeartVO;
import com.example.pif.mapper.CommentHeartMapper;

@Service
public class CommentHeartServiceimpl implements CommentHeartService{

    @Autowired
    CommentHeartMapper commentHeartMapper;

    @Override
    public void registerHeart(CommentHeartVO commentHeartVO) {
        commentHeartMapper.registerHeart(commentHeartVO);
    }

    @Override
    public void deleteHeart(CommentHeartVO commentHeartVO) {
        commentHeartMapper.deleteHeart(commentHeartVO);
    }

    @Override
    public Integer getHeart(String ch_id, Integer ch_num) {
        return commentHeartMapper.getHeart(ch_id, ch_num);
    }

    @Override
    public Integer getCount(Integer ch_num) {
        return commentHeartMapper.getCount(ch_num);
    }

    @Override
    public Integer getMyCount(String ch_id) {
        return commentHeartMapper.getMyCount(ch_id);
    }
    
}
