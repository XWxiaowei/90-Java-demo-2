package com.jay.freemarker;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiang.wei on 2018/10/17
 *
 * @author xiang.wei
 */
public class FreemarketTest {
    public static final String TEMPLATE_PATH = "/spring-boot-freemarker/src/main/resources/templates"; //模板路径

    public static void main(String[] args) {
        autoGenJAVATest();
    }

    private static void autoGenJAVATest() {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("classPath", "com.jay.freemarker");
        dataMap.put("className", "AutoJava");
        dataMap.put("helloWorld", "这是我的第一个Freemarker程序");
        genFileWithTemplate("helloworld.ftl", "AutoGenHello.java", dataMap);

    }

    /**
     * @param templateFileName
     * @param destFileName
     * @param dataMap
     */
    private static void genFileWithTemplate(String templateFileName, String destFileName,
                                            Map<String, Object> dataMap) {
        String DEST_PATH = "/spring-boot-freemarker/src/main/java/com/jay/freemarker";//目标路径【指向你自己的类文件存放路径】
//       创建freemarker配置实例
        Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        Writer out = null;
        try {
//            设置模板路径
            configuration.setDirectoryForTemplateLoading(new File(System.getProperty("user.dir")+TEMPLATE_PATH));
//            加载模板文件
            Template template = configuration.getTemplate(templateFileName);
            //生成数据
            File docFile = new File(System.getProperty("user.dir")+DEST_PATH + "/" + destFileName);
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
//            输出文件
            template.process(dataMap, out);
            System.out.println(destFileName + "模板文件创建成功");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();

                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }
}
