package com.jay.chapter1;

import com.jay.entity.Student;
import com.jay.chapter1.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by xiang.wei on 2019/4/14
 *
 * @author xiang.wei
 */
public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() {
        String resource = "chapter1/mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "development");
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void mybatisTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.selectByName("点点");
        if (studentList != null) {
            System.out.println("----->"+studentList.get(0).toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
