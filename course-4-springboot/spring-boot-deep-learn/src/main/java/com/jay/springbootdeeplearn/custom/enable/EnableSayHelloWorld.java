package com.jay.springbootdeeplearn.custom.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xiang.wei on 2018/9/11
 *
 * @author xiang.wei
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({SayHelloWorldConfiguration.class})
public @interface EnableSayHelloWorld {
}
