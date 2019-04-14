package com.jay.chapter1.mapper;

import com.jay.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    /**
     * @param name
     * @return
     */
    List<Student> selectByName(@Param("name") String name);
}
