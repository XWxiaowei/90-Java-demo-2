package com.jay.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiang.wei on 2018/10/17
 *
 * @author xiang.wei
 */
public class FreemarketTest2 {
    private static final String profile_path = System.getProperty("user.dir")+"/spring-boot-freemarker";
    private static final String TEMPLATE_PATH = profile_path+"/src/main/resources/templates/";//模板路径

    //通过.ftl模板生成java类
    public static void main(String[] args) {

        autoGenHTMLTest();
//        autoGenJAVATest();

    }
    //根据模板自动创建html-示例
    private static void autoGenHTMLTest()
    {
        //给模板文件组装数据
        Map<String, Object> dataMap = new HashMap<String, Object>();
        User user=new User();
        user.setName("Template-FreeMarker");
        user.setId("123456789");
        dataMap.put("user",user);
        dataMap.put("title","FreeMarker自动生成HTML");
        dataMap.put("datetime",new Date());
        //设置列表数据
        List<User> peoples=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            User user2=new User();
            user2.setName("A"+i);
            user2.setId("a"+i);
            peoples.add(user2);
        }
        dataMap.put("peoples",peoples);
        //设置map数据
        HashMap<String,User> employees=new HashMap<>();
        for(int m=0;m<6;m++)
        {
            User user3=new User();
            user3.setName("雇员"+m);
            user3.setId("emp"+m);
            employees.put(user3.getId(),user3);
        }
        dataMap.put("employees",employees);

        String DEST_PATH = profile_path+"/src/main/resources/static/demo/";//目标路径
        genFileWithTemplate(TEMPLATE_PATH,DEST_PATH,"hello-html.ftl","hello.html",dataMap);
    }

    //通过.flt模板生成file
    private static void genFileWithTemplate(String templateDir,String destDir,String templateFileName,String destFileName,Map<String,Object> dataMap)
    {
        //创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            //设置模版路径
            configuration.setDirectoryForTemplateLoading(new File(templateDir));
            //加载模版文件
            Template template = configuration.getTemplate(templateFileName);
            //生成数据
            File docFile = new File(destDir + "\\" + destFileName);
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            //输出文件
            template.process(dataMap, out);
            System.out.println(destFileName+" 模板文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                    out.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
