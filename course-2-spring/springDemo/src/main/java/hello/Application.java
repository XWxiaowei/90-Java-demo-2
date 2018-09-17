package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//当前类是个配置类
//@Configuration
//表示扫码当前类所在的包及其子包的所有类
//@ComponentScan
public class Application {

    //@Bean与xml配置文件中的<bean id="" ../>相等
//    @Bean
//	MessageService messageService() {
//		return new MessageServiceImpl();
//	};

    public static void main(String[] args) {
        //从xml读取元数据初始化上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //注解形式初始化上下文
//        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        MessageService service = (MessageService) context.getBean("messageService");
        System.out.println(service.getMessage());

        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();
    }
}