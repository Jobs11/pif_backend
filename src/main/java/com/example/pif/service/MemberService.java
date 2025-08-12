package com.example.pif.service;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.MemberVO;

public interface MemberService {
    public MemberVO getUser(@Param("m_id") String m_id, @Param("m_password") String m_password);

    public void registerUser(MemberVO member);

    public void deleteUser(String m_id);

    public void updateUser(MemberVO member);
}
