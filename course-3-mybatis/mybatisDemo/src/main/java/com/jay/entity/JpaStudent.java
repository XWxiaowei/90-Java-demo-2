package com.jay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xiang.wei on 2019/4/15
 *
 * @author xiang.wei
 */
@Entity
@Table(name = "student")
public class JpaStudent {
    /**
     *     // 学号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *     // 姓名
     */
    private String name;

    /**
     *     // 年龄
     */
    private Integer age;

    /**
     * // 班级
     */
    @Column(name = "class_id")
    private String classId;

    public JpaStudent(String name, Integer age, String classId) {
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public JpaStudent() {
    }

    @Override
    public String toString() {
        return "JpaStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId='" + classId + '\'' +
                '}';
    }
}
