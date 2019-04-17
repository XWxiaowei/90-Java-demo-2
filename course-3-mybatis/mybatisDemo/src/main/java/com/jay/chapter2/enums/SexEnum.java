package com.jay.chapter2.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public enum SexEnum {
    MAN("0", "男"),
    WEMAN("1", "女");
    private String key;
    private String value;

    final static Map<String, SexEnum> SEX_MAP = new HashMap<>();

    static {
        for (SexEnum sexEnums : SexEnum.values()) {
            SEX_MAP.put(sexEnums.key, sexEnums);
        }
    }

    SexEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static SexEnum getEnums(String key) {
        return SEX_MAP.get(key);
    }
}
