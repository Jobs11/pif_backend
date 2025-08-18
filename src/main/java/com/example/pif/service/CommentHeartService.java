package com.example.pif.service;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.CommentHeartVO;

public interface CommentHeartService {

    public void registerHeart(CommentHeartVO commentHeartVO);

    public void deleteHeart(CommentHeartVO commentHeartVO);

    public Integer getHeart(@Param("ch_id") String ch_id, @Param("ch_num") Integer ch_num);

    public Integer getCount(@Param("ch_num") Integer ch_num);

    public Integer getMyCount(@Param("ch_id") String ch_id);
}