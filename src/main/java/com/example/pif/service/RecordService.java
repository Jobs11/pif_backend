package com.example.pif.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pif.dto.RecordVO;

public interface RecordService {
    public List<RecordVO> getRecordList(String m_id, String r_date);

    public RecordVO getRecord(Integer r_num);

    public List<RecordVO> getRecordAllList(String m_id);

    public void registerRecord(RecordVO recordVO);

    public void deleteRecord(Integer r_num);

    public void updateRecord(RecordVO recordVO);
}
