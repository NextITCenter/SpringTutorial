package kr.or.nextit.springtutorial.aop;

import kr.or.nextit.springtutorial.SpringTutorialApplication;
import kr.or.nextit.springtutorial.cafe.Cafe;
import kr.or.nextit.springtutorial.cafe.Coffee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AOPExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AOPExample.class, args);
        AOPMethod aopMethod = context.getBean("aopMethod", AOPMethod.class);
        aopMethod.method4();

        Cafe cafe = context.getBean("cafe", Cafe.class);
        Coffee coffee = cafe.orderCoffee(4000);
        System.out.println(coffee);
    }
}
