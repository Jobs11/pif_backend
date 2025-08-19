package com.example.pif.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.HeartVO;

@Mapper
public interface HeartMapper {

    
    public void registerHeart(HeartVO heartVO);

    public void deleteHeart(HeartVO heartVO);

    public Integer getHeart(@Param("h_id") String h_id, @Param("h_num") Integer h_num);

    public Integer getCount(@Param("h_num") Integer h_num);

    public Integer getMyCount(@Param("h_id") String h_id);

    public List<Integer> getTopHeart();

    
    
}
