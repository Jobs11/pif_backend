package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.CommentVO;

public interface CommentService {

    public List<CommentVO> getCommentList(Integer c_getnum);

    public Integer getCount(Integer c_getnum);

    public void registerComment(CommentVO comment);

    public void deleteComment(Integer c_num);

    public void updateComment(CommentVO comment);

    public Integer getMyCount(String c_id);

}
