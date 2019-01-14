package com.other;

import com.jay.springbootdeeplearn.custom.condition.ConditionalOnSystemProperty;
import com.jay.springbootdeeplearn.custom.enable.SayHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
//    @ConditionalOnSystemProperty(value = "Mac OS X")
    SayHelloWorld sayHelloWorld() {

        System.out.println("---------------》加载sayhelloworld");

        return new SayHelloWorld();
    }

}
