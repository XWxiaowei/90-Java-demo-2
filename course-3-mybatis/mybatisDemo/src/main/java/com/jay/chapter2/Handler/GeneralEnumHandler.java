package com.jay.chapter2.Handler;

import com.jay.chapter2.enums.BaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xiang.wei
 * @create 2019/4/18 14:04
 */
public class GeneralEnumHandler<E extends BaseEnum> extends BaseTypeHandler<E> {
    private Class<E> type;
    private E[] enums;

    public GeneralEnumHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
        this.enums = type.getEnumConstants();
        if (enums == null) {
            throw new IllegalArgumentException(type.getSimpleName()
                    + "does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setObject(i, e.getKey());
        } else {
            preparedStatement.setObject(i, e.getKey(), jdbcType.TYPE_CODE);
        }
    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        if (resultSet.wasNull()) {
            return null;
        }
        Object key = resultSet.getObject(s);
        return locateEnumsStatus(key);
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if (resultSet.wasNull()) {
            return null;
        }
        Object key = resultSet.getObject(i);
        return locateEnumsStatus(key);
    }

    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        if (callableStatement.wasNull()) {
            return null;
        }
        Object key = callableStatement.getObject(i);
        return locateEnumsStatus(key);
    }

    /**
     * @param key
     * @return
     */
    private E locateEnumsStatus(Object key) {
        if (key instanceof Integer) {
            for (E anEnum : enums) {
                if (anEnum.getKey() == key) {
                    return anEnum;
                }
            }
            throw new IllegalArgumentException("未知的枚举类型：" + key + ",请核对" + type.getSimpleName());
        }
        if (key instanceof String) {
            for (E anEnum : enums) {
                if (anEnum.getKey().equals(key)) {
                    return anEnum;
                }
            }
            throw new IllegalArgumentException("未知的枚举类型：" + key + ",请核对" + type.getSimpleName());
        }
        throw new IllegalArgumentException("未知的枚举类型：" + key + ",请核对" + type.getSimpleName());
    }

}
