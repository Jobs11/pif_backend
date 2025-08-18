package com.example.pif.service;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.HeartVO;

public interface HeartService {
    public void registerHeart(HeartVO heartVO);

    public void deleteHeart(HeartVO heartVO);

    public Integer getHeart(@Param("h_id") String h_id, @Param("h_num") Integer h_num);

    public Integer getCount(@Param("h_num") Integer h_num);

    public Integer getMyCount(@Param("h_id") String h_id);
    
}
