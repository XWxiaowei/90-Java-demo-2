package com.jay.chapter2.enums;

import java.util.Set;

/**
 * 万能的转化模板
 *
 * @author xiang.wei
 * @create 2019/4/18 13:55
 */
public interface BaseEnum<E extends Enum<?>, T> {
    /**
     * 真正与数据库进行映射的值
     * @return
     */
    T getKey();

    /**
     * 显示的信息
     * @return
     */
    String getValue();
}
