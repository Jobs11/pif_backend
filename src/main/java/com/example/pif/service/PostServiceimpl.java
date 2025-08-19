package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pif.dto.PostVO;
import com.example.pif.mapper.PostMapper;

@Service
public class PostServiceimpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Override
    public List<PostVO> getPostList(String p_public) {
        return postMapper.getPostList(p_public);
    }

    @Override
    public void registerPost(PostVO postVO) {
        postMapper.registerPost(postVO);
    }

    @Override
    public void deletePost(Integer p_num) {
        postMapper.deletePost(p_num);
    }

    @Override
    public void updatePost(PostVO postVO) {
        postMapper.updatePost(postVO);
    }

    @Override
    public Integer getMyCount(String p_id) {
        System.out.println("개수: 등장");
        return postMapper.getMyCount(p_id);
    }

    @Override
    public List<PostVO> getPostTop() {
        return postMapper.getPostTop();
    }

    @Override
    public List<PostVO> getMyPost(String p_id) {
        return postMapper.getMyPost(p_id);
    }

}
