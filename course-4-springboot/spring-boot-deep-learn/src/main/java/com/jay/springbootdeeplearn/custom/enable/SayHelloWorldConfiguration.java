package com.jay.springbootdeeplearn.custom.enable;

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
    SayHelloWorld sayHelloWorld() {
        System.out.println("here to loading bean say helloworld!");
        return new SayHelloWorld();
    }
}
