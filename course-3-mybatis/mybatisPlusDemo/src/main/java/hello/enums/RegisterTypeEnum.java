package hello.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户类型
 * @author xiang.wei
 * @create 2018/3/12 16:35
 */
public enum RegisterTypeEnum {
    PERSON("0","个人用户"),
    COMPANY("1","企业用户");

    private String key;
    private String value;
    private static final Map<String, String> resultMap = new HashMap<String, String>(2);
    static {
        for (RegisterTypeEnum type : RegisterTypeEnum.values()) {
            resultMap.put(type.key, type.value);
        }
    }

    RegisterTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(String key) {
        return resultMap.get(key);
    }

}
