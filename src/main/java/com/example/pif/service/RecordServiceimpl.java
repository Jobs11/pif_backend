package com.example.pif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pif.dto.RecordVO;
import com.example.pif.mapper.RecordMapper;

public class RecordServiceimpl implements RecordService {


    @Autowired
    RecordMapper recordMapper;

    @Override
    public List<RecordVO> getRecordList(String m_id, String r_date) {
        return recordMapper.getRecordList(m_id, r_date);
    }

    @Override
    public void registerRecord(RecordVO recordVO) {
        recordMapper.registerRecord(recordVO);
    }

    @Override
    public void deleteRecord(Integer r_num) {
        recordMapper.deleteRecord(r_num);
    }

    @Override
    public void updateRecord(RecordVO recordVO) {
        recordMapper.updateRecord(recordVO);
    }

    
}