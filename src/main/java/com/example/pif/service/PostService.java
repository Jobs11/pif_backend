package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.PostVO;

public interface PostService {
    public List<PostVO> getPostList(@Param("p_public") String p_public);
    
    public void registerPost(PostVO postVO);

    public void deletePost(String p_id);

    public void updatePost(PostVO postVO);

    public Integer getMyCount(@Param("p_id") String p_id);
}
