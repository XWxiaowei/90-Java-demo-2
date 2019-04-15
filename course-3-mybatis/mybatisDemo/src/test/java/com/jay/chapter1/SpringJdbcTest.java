package com.jay.chapter1;

import com.jay.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xiang.wei on 2019/4/14
 *
 * @author xiang.wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter1/application.xml")
public class SpringJdbcTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void  testSpringJdbc() {
        String sql = "select id,name,age from student where name LIKE ?";
        List<Student> studentList = jdbcTemplate.query(sql, new Object[]{"%点点%"}, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("----->执行的sql={}"+sql);
        System.out.println("----->查询结果={}"+studentList.get(0).toString());
    }
}
