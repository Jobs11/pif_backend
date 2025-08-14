package com.example.pif.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.MemberVO;
import com.example.pif.service.MemberService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@Slf4j
@RestController
@RequestMapping("/pif/member/")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/register")
    public void registerUser(@RequestBody MemberVO member) {
        memberService.registerUser(member);
        System.out.println("회원 등록완료");
    }
    
    @GetMapping("/getUser")
    public MemberVO getUser(@Param("m_id") String m_id, @Param("m_password") String m_password) {
        MemberVO member = memberService.getUser(m_id, m_password);
        System.out.println("회원 불러오기 성공");
        log.info("회원 불러오기 성공: {}", member);
        return member;
    }

    @GetMapping("/getUserdata")
    public MemberVO getUserData(@Param("m_id") String m_id) {
        MemberVO member = memberService.getUserData(m_id);
        System.out.println("회원 불러오기 성공");
        log.info("회원 불러오기 성공: {}", member);
        return member;
    }

    @PostMapping("/modify")
    public void modifyUser(@RequestBody MemberVO member) {
        memberService.updateUser(member);
    }
    

    @PostMapping("/delete")
    public void deleteUser(@Param("m_id") String m_id) {
        System.out.println("회원 삭제완료");
        memberService.deleteUser(m_id);
    }

    @PostMapping("/upprofile")
    public void updateProfile(@RequestBody MemberVO member) {
        memberService.updateProfile(member);
        System.out.println("프로필 수정 성공");
        log.info("프로필 수정 성공: {}", member);
    }
    
    
    
}
