package com.example.pif.service;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.CommentHeartVO;

public interface CommentHeartService {

    public void registerHeart(CommentHeartVO commentHeartVO);

    public void deleteHeart(CommentHeartVO commentHeartVO);

    public Integer getHeart(String ch_id, Integer ch_num);

    public Integer getCount(Integer ch_num);

    public Integer getMyCount(String ch_id);
}