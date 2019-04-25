package com.jay.chapter2.enums;

/**
 * @author xiang.wei
 * @create 2019/4/25 15:27
 */
public enum ClassTypeEnum {
    GOOD_CLASS("1", "好班"),
    BAD_CLASEE("0", "差班"),;

    private String key;
    private String value;

    ClassTypeEnum(String key, String value) {
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
