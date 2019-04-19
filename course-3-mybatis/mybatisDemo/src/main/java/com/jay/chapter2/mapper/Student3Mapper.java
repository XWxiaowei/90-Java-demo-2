package com.jay.chapter2.mapper;

import com.jay.chapter2.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiang.wei
 * @create 2019/4/19 19:05
 */
public interface Student3Mapper {

    /**
     * 查询学生
     * @param id
     * @param name
     * @return
     */
    List<Student> selectStudent(@Param("id") Integer id,
                                @Param("name") String name);

    /**
     * 批量查询学生
     * @param ids
     * @return
     */
    List<Student> selectByIds(@Param("ids") List<Integer> ids);

    /**
     * @param name
     * @param age
     * @return
     */
    List<Student> selectByNameOrAge(@Param("name") String name,
                                    @Param("age") Integer age);

    /**
     * 更新学生记录
     * @param student
     * @return
     */
    boolean updateStudent(Student student);
}
