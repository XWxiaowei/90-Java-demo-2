package mapper;

import entity.StudentEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 *
 */
public class SimpleDemoTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        //build()方法可以指定环境，
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));

    }

    /**
     * 一个简单mybatis的demo
     */
    @Test
    public void simpleTest() {
        //创建session实例
        SqlSession session = factory.openSession();

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentEntity student = mapper.getStudentById(1);

        System.out.println(student.toString());
        //关闭session
        session.close();
    }

    /**
     * 查看当前数据库的表，和表的字段信息
     */
    @Test
    public void datasourceTest() {
        //创建session实例
        SqlSession session = factory.openSession();

        DatasourceMapper mapper = session.getMapper(DatasourceMapper.class);

        List<Map> tablses = mapper.listTable();
        System.out.println(tablses.toString());

        List<Map> columns = mapper.listTableColumn("student");
        System.out.println(columns.toString());


        //关闭session
        session.close();
    }

}
