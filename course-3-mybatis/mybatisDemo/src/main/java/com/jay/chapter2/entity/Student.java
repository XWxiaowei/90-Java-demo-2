package com.jay.chapter2.entity;

import com.jay.chapter2.enums.SexEnum;
import lombok.Data;

@Data
public class Student {

    // 学号
    private Integer id;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 班级
    private String classId;
    /**
     * 性别
     */
    private SexEnum sexEnum;

    /**
     * 班级
     */
    private ClassRoom classRoom;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId='" + classId + '\'' +
                ", sexEnum=" + sexEnum.toString() +
                ", classRoom=" + classRoom +
                '}';
    }
}
