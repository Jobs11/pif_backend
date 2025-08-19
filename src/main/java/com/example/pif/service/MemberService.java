package com.example.pif.service;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.MemberVO;

public interface MemberService {
    public MemberVO getUser(String m_id, String m_password);

    public MemberVO getUserData(String m_id);

    public void registerUser(MemberVO member);

    public void deleteUser(String m_id);

    public void updateUser(MemberVO member);

    public void updateProfile(MemberVO memberVO);
}
