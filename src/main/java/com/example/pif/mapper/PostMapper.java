package com.example.pif.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.PostVO;

@Mapper
public interface PostMapper {

    public List<PostVO> getPostList(@Param("p_public") String p_public);

    public void registerPost(PostVO postVO);

    public void deletePost(@Param("p_num") Integer p_num);

    public void updatePost(PostVO postVO);

    public Integer getMyCount(@Param("p_id") String p_id);

    public List<PostVO> getPostTop();

    public List<PostVO> getMyPost(@Param("p_id") String p_id);

}
