package com.jay.springbootdeeplearn.custom.enable;

import com.jay.springbootdeeplearn.custom.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiang.wei on 2018/9/11
 *
 * @author xiang.wei
 */
@Configuration
public class SayHelloWorldConfiguration {

    @Bean
    @ConditionalOnSystemProperty(value = "Mac OS X")
    SayHelloWorld sayHelloWorld() {
        System.out.println("here to loading bean say helloworld!");
        return new SayHelloWorld();
    }
}
