package com.jay.chapter1;

import com.jay.chapter1.mapper.JpaStudentDao;
import com.jay.entity.JpaStudent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xiang.wei on 2019/4/15
 *
 * @author xiang.wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter1/application-jpa.xml")
public class JPATest {
    @Autowired
    JpaStudentDao jpaStudentDao;

    @Before
   public void init() {
        JpaStudent jpaStudent = new JpaStudent("张三", 12, "121");
        jpaStudentDao.save(jpaStudent);
    }

    @Test
    public void testCrudRepostitory() {
        List<JpaStudent> jpaStudents = jpaStudentDao.getByNameLike("张三");
        System.out.println("--------》JPA查询返回结果");
        jpaStudents.forEach(System.out::println);
        System.out.println();
    }
}
