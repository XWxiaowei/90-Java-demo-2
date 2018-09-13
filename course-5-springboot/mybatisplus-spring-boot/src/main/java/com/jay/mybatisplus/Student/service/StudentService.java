package com.jay.mybatisplus.Student.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.jay.mybatisplus.model.Student;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-13
 */
public interface StudentService extends IService<Student> {
    /**
     * @param page
     * @return
     */
    Page<Student> selectStudentPage(Page<Student> page);
}
