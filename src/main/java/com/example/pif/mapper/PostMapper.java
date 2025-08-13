package com.example.pif.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.PostVO;

@Mapper
public interface PostMapper {

    public List<PostVO> getPostList(@Param("p_public") String p_public);
    
    public void registerPost(PostVO postVO);

    public void deletePost(String p_id);

    public void updatePost(PostVO postVO);

    
}
