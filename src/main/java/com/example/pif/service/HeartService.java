package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.HeartVO;

public interface HeartService {
    public void registerHeart(HeartVO heartVO);

    public void deleteHeart(HeartVO heartVO);

    public Integer getHeart(String h_id, Integer h_num);

    public Integer getCount(Integer h_num);

    public Integer getMyCount(String h_id);

    public List<Integer> getTopHeart();

}
