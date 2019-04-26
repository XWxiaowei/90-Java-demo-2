package com.jay.chapter3.entity;

import com.jay.chapter3.enums.ClassTypeEnum;
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
     * 班级类型
     */
    private String classType;

    /**
     *
     */
    private ClassTypeEnum classTypeEnum;
}
