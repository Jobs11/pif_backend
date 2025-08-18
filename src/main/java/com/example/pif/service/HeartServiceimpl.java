package com.example.pif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pif.dto.HeartVO;
import com.example.pif.mapper.HeartMapper;

@Service
public class HeartServiceimpl implements HeartService{

    @Autowired
    HeartMapper heartMapper;

    @Override
    public void registerHeart(HeartVO heartVO) {
        heartMapper.registerHeart(heartVO);
    }

    @Override
    public void deleteHeart(HeartVO heartVO) {
        heartMapper.deleteHeart(heartVO);
    }

    @Override
    public Integer getHeart(String h_id, Integer h_num) {
        return heartMapper.getHeart(h_id, h_num);
    }

    @Override
    public Integer getCount(Integer h_num) {
        return heartMapper.getCount(h_num);
    }

    @Override
    public Integer getMyCount(String h_id) {
        return heartMapper.getMyCount(h_id);
    }
    
}
