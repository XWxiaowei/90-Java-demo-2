package com.jay.springbootdeeplearn;

import com.jay.springbootdeeplearn.custom.condition.ConditionalOnSystemProperty;
import com.jay.springbootdeeplearn.custom.enable.EnableSayHelloWorld;
import com.jay.springbootdeeplearn.custom.selector.EnableSelectorHelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableSayHelloWorld
@EnableSelectorHelloWorld
@SpringBootApplication
public class SpringBootDeepLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeepLearnApplication.class, args);
	}
}
