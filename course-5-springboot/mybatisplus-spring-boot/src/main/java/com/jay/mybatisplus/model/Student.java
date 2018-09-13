package com.jay.mybatisplus.model;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-13
 */
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private Integer classid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
        "name=" + name +
        ", age=" + age +
        ", classid=" + classid +
        "}";
    }
}
