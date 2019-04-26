package com.jay.chapter3.enums;

/**
 * @author xiang.wei
 * @create 2019/4/25 15:27
 */
public enum ClassTypeEnum implements BaseEnum<ClassTypeEnum, String>{
    GOOD_CLASS("1", "好班"),
    BAD_CLASEE("0", "差班"),;

    private String key;
    private String value;

    ClassTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
