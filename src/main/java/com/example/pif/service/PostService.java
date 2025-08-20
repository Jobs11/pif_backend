package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.PostVO;

public interface PostService {
    public List<PostVO> getPostList(String p_public);

    public void registerPost(PostVO postVO);

    public void deletePost(Integer p_num);

    public void updatePost(PostVO postVO);

    public Integer getMyCount(String p_id);

    public List<PostVO> getPostTop();

    public List<PostVO> getMyPost(String p_id);

    public List<PostVO> getSearchPost(String p_content);
}
