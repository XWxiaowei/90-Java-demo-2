package com.jay.mybatisplus.controller.Student;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;
import com.jay.mybatisplus.Student.service.StudentService;
import com.jay.mybatisplus.model.Student;
import com.jay.mybatisplus.util.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-13
 */
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryStudent.do")
    public String queryStudentPage() {
        log.info("查询用户开始");
        Page<Student> page = new Page<>(0,2);
        Page<Student> studentPage = studentService.selectStudentPage(page);
        return JSON.toJSONString(ResultData.success(studentPage.getRecords()));
    }

}

