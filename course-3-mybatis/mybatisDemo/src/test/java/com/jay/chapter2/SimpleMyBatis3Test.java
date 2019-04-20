package com.jay.chapter2;

import com.jay.chapter2.entity.Student;
import com.jay.chapter2.mapper.Student3Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang.wei
 * @create 2019/4/19 19:42
 */
public class SimpleMyBatis3Test extends BaseMyBatisTest {

    @Test
    public void testSelectStudent() {
        SqlSession session = sqlSessionFactory.openSession();
        Student3Mapper mapper = session.getMapper(Student3Mapper.class);
        List<Student> students = mapper.selectStudent(1, null);
        System.out.println("----》SelectStudent只传id返回结果"+students.toString());
        List<Student> students1 = mapper.selectStudent(null, "平平");
        System.out.println("----》SelectStudent只传name返回结果"+students1.toString());
    }

    @Test
    public void testSelectByIds() {
        SqlSession session = sqlSessionFactory.openSession();
        Student3Mapper mapper = session.getMapper(Student3Mapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<Student> students = mapper.selectByIds(ids);
        System.out.println("---->SelectByIds通过ids查询返回结果" + students.toString());
    }
    @Test
    public void  selectByNameOrAge() {
        SqlSession session = sqlSessionFactory.openSession();
        Student3Mapper mapper = session.getMapper(Student3Mapper.class);
        List<Student> students = mapper.selectByNameOrAge("美美", null);
        System.out.println("---->selectByNameOrAge通过name查询返回结果" + students.toString());
        List<Student> students1 = mapper.selectByNameOrAge(null, 16);
        System.out.println("----->selectByNameOrAge通过age查询返回的结果" + students1.toString());

    }
    @Test
    public void testUpdateStudent() {
        SqlSession session = sqlSessionFactory.openSession();
        Student3Mapper mapper = session.getMapper(Student3Mapper.class);
        Student student = new Student();
        student.setId(1);
        student.setName("小伟");
        student.setAge(29);
        boolean result = mapper.updateStudent(student);
        System.out.println("--->updateStudent更新结果" + result);
    }
}
