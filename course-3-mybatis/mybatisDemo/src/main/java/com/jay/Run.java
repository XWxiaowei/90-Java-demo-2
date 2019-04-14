package com.jay;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jay.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jay.mapper.StudentMapper;

public class Run {
    public static void main(String[] args) {
        String resource = "mybatis-cfg.xml";
        InputStream inputStream;
        try {

            {
                //读取mybatis-config.xml文件
                inputStream = Resources.getResourceAsStream(resource);
                //初始化mybatis,创建SqlSessionFactory类的实例
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "development");
                //创建session实例
                SqlSession session = sqlSessionFactory.openSession();

                StudentMapper mapper = session.getMapper(StudentMapper.class);


                List<Student> studentList = mapper.selectByName("点点");
                System.out.println(studentList.get(0).toString());
                //关闭session
                session.close();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
