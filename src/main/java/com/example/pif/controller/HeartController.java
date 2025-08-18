package com.example.pif.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.HeartVO;
import com.example.pif.service.HeartService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@Slf4j
@RestController
@RequestMapping("/pif/heart/")
public class HeartController {

    @Autowired
    HeartService heartService;

    @PostMapping("/register")
    public void registerHeart(@RequestBody HeartVO heart) {
        heartService.registerHeart(heart);
        System.out.println("좋아요 완료!");
    }

    @PostMapping("/delete")
    public void deleteHeart(@RequestBody HeartVO heart) {
        heartService.deleteHeart(heart);
        System.out.println("좋아요 취소!");
    }
    
    @GetMapping("/getHeart")
    public Integer getHeart(@Param("h_id") String h_id, @Param("h_num") Integer h_num) {
        return heartService.getHeart(h_id, h_num);
    }
    
    @GetMapping("/getCount")
    public Integer getCount(@Param("h_num") Integer h_num) {
        return heartService.getCount(h_num);
    }
    
    @GetMapping("/getMyCount")
    public Integer getMyCount(@Param("h_id") String h_id) {
        return heartService.getMyCount(h_id);
    }
}
