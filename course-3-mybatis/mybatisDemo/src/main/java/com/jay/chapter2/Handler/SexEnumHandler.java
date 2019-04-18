package com.jay.chapter2.Handler;

import com.jay.chapter2.enums.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xiang.wei on 2019/4/17
 *
 * @author xiang.wei
 */
public class SexEnumHandler extends BaseTypeHandler<SexEnum> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,sexEnum.getKey());
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        if (resultSet.wasNull()) {
            return null;
        }
        String key = resultSet.getString(columnName);
        return SexEnum.getEnums(key);
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if (resultSet.wasNull()) {
            return null;
        }
        String key = resultSet.getString(i);
        return SexEnum.getEnums(key);
    }

    @Override
    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        if (callableStatement.wasNull()) {
            return null;
        }
        String key = callableStatement.getString(i);
        return SexEnum.getEnums(key);
    }
}
