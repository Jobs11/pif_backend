package com.example.pif.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import com.example.pif.dto.RecordVO;

@Mapper
public interface RecordMapper {

    public List<RecordVO> getRecordList(@Param("m_id") String m_id, @Param("r_date") String r_date);
    
    public void registerRecord(RecordVO recordVO);

    public void deleteRecord(Integer r_num);

    public void updateRecord(RecordVO recordVO);
    
}
