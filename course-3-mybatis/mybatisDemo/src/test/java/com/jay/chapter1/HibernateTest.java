package com.jay.chapter1;

import com.jay.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Objects;


/**
 * Created by xiang.wei on 2019/4/15
 *
 * @author xiang.wei
 */
public class HibernateTest {
    private SessionFactory sessionFactory;


    @Before
    public void init() {
        Configuration configuration = new Configuration();
        configuration.configure("chapter1/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    @After
    public void destroy() {
        sessionFactory.close();
    }

    @Test
    public void testORM() {
        System.out.println("--------------ORM Query-------------");

        Session session = null;

        try {
            session = sessionFactory.openSession();
            int id = 1;
            Student student = session.get(Student.class, id);
            System.out.println("ORM Query Result:");
            System.out.println(student.toString());
            System.out.println();
        } finally {
            if (Objects.nonNull(session)) {
                session.close();
            }
        }
    }

    @Test
    public void testHQL() {
        System.out.println("--------------HQL Query-----------");
        Session session = null;

        try {
            session = sessionFactory.openSession();
            String hql = "FROM Student WHERE name=:name";
            Query query = session.createQuery(hql);
            query.setParameter("name", "点点");

            List<Student> studentList = query.list();
            System.out.println("HQL Query Result:");
            studentList.forEach(System.out::println);
            System.out.println();
        } finally {
            if (Objects.nonNull(session)) {
                session.close();
            }
        }
    }

   @Test
    public void testJpaCriteria() {
       System.out.println("-------------JPA Criteria-------------");

       Session session = null;

       try {
           session = sessionFactory.openSession();
           CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
           CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//       定义FROM子句
           Root<Student> student = criteriaQuery.from(Student.class);
//       构建查询条件
           Predicate equal = criteriaBuilder.equal(student.get("name"), "点点");
//       通过具有语义化的方法构建SQL，等价于SELECT ... FROM student WHERE ...
           criteriaQuery.select(student).where(equal);

           Query<Student> query = session.createQuery(criteriaQuery);
           List<Student> studentList = query.getResultList();
           System.out.println("JPA Criteria Query Result:");
           studentList.forEach(System.out::println);
       } finally {
           if (Objects.nonNull(session)) {
               session.close();
           }
       }

   }
}
