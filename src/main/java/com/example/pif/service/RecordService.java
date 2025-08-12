package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.RecordVO;

public interface RecordService {
    public List<RecordVO> getRecordList(@Param("m_id") String m_id, @Param("r_date") String r_date);
    
    public void registerRecord(RecordVO recordVO);

    public void deleteRecord(Integer r_num);

    public void updateRecord(RecordVO recordVO);
}
