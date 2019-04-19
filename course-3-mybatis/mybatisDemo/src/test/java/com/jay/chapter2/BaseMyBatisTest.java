package com.jay.chapter2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiang.wei
 * @create 2019/4/19 19:42
 */
public class BaseMyBatisTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        InputStream is = null;
        String url = "chapter2/mybatis-cfg.xml";
        try {
            try {
                is = Resources.getResourceAsStream(url);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
