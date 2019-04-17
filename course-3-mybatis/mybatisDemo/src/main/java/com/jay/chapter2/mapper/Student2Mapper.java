package com.jay.chapter2.mapper;

import com.jay.chapter2.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public interface Student2Mapper {

    /**
     * @param id
     * @return
     */
    Student selectStudentById(@Param("id") Integer id);
}
