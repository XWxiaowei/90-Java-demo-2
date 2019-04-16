package com.jay.chapter2.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
@Data
public class ClassRoom {
    /**
     * 班级id
     */
    private int id;

    /**
     * 班级名称
     */
    private String name;

    /**
     *
     */
    private List<Student> studentList;
}
