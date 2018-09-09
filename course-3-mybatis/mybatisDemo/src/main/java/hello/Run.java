package hello;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import hello.entity.Student;
import hello.mapper.StudentMapper;

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


                Student student = mapper.selectOneById(1L);
                System.out.println(student.toString());
                //关闭session
                session.close();

            }

            {
                //读取mybatis-config.xml文件
                inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "development2");
                //创建session实例
                SqlSession session = sqlSessionFactory.openSession();

                StudentMapper mapper = session.getMapper(StudentMapper.class);

                Student student2 = mapper.selectOneById(1L);
                System.out.println(student2.toString());

                //关闭session
                session.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
