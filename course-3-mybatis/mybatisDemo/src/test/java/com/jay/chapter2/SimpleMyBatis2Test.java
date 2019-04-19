package com.jay.chapter2;

import com.jay.chapter2.entity.Student;
import com.jay.chapter2.mapper.Student2Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public class SimpleMyBatis2Test {

    private SqlSessionFactory sqlSessionFactory;
    /**
     *
     */
    @Before
    public void setUp() {
        String config = "chapter2/mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectStudent() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student2Mapper mapper = sqlSession.getMapper(Student2Mapper.class);
        Student student = mapper.selectStudentById(1);
        System.out.println("------>返回结果"+student.toString());
    }
}
