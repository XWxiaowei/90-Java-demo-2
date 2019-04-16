package com.jay.chapter2.entity;

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
    private String sex;

}
