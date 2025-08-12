package com.example.pif.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pif.dto.MemberVO;
import com.example.pif.dto.RecordVO;
import com.example.pif.service.RecordService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pif/record/")
public class RecordController {

    @Autowired
    RecordService recordService;

    @PostMapping("/register")
    public void registerRecord(@RequestBody RecordVO recordVO) {
        recordService.registerRecord(recordVO);
        System.out.println("등록완료");
    }

    @GetMapping("/getlist")
    public List<RecordVO> getRecordList(@Param("m_id") String m_id, @Param("r_date") String r_date) {
        List<RecordVO> record = recordService.getRecordList(m_id, r_date);
        System.out.println("불러오기 성공");
        log.info("불러오기 성공: {}", record);
        return record;
    }


    @PostMapping("/modify")
    public void ModifyRecord(@RequestBody RecordVO recordVO) {
        recordService.updateRecord(recordVO);
    }
    
    @PostMapping("/delete")
    public void deleteRecord(@Param("r_num") Integer r_num) {
        System.out.println("삭제완료");
        recordService.deleteRecord(r_num);
    }

}
