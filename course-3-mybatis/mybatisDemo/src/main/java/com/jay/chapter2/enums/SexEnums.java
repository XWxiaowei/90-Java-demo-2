package com.jay.chapter2.enums;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public enum SexEnums {
    MAN("0", "男"),
    WEMAN("1", "女");
    private String key;
    private String value;

    SexEnums(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
