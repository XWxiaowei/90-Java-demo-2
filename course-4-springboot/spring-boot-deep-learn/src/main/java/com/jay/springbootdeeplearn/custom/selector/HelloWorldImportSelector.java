package com.jay.springbootdeeplearn.custom.selector;

import com.jay.springbootdeeplearn.custom.enable.SayHelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created by xiang.wei on 2018/9/11
 *
 * @author xiang.wei
 */
public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
//        获取注解上的属性值
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(EnableSelectorHelloWorld.class.getName());
        String model = (String) annotationAttributes.get("model");
        System.out.println("--------------------->"+model);

//        可以返回多个加载的配置或bean
        return new String[]{SayHelloWorldConfiguration.class.getName()};
    }

}
