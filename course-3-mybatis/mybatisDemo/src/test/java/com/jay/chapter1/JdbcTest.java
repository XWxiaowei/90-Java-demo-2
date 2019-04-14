package com.jay.chapter1;

import com.jay.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiang.wei on 2019/4/14
 *
 * @author xiang.wei
 */
public class JdbcTest {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatisdemo";
        String userName = "root";
        String password = "admin";

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);

            String sql = "select id,name,age from student where name LIKE ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%点点%");
            resultSet = statement.executeQuery();
            List<Student> studentList = new ArrayList<Student>();
            if (resultSet != null) {
                while (resultSet.next()) {
                    Student student = new Student();
                    student.setId(resultSet.getInt("id"));
                    student.setName(resultSet.getString("name"));
                    student.setAge(resultSet.getInt("age"));
                    studentList.add(student);
                }
            }
            System.out.println("----->执行的sql={}"+sql);
            System.out.println("----->resultSet={}"+studentList.get(0).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
