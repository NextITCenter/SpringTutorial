package kr.or.nextit.springtutorial.cal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorExample {
    public static void main(String[] args) {
        int num = 30;
        ApplicationContext context = SpringApplication.run(CalculatorExample.class, args);
        Calculator cal = context.getBean("forLoop", ForLoop.class);
        long result1 = cal.factorial(num);

        cal = context.getBean("recursive", Recursive.class);
        long result2 = cal.factorial(num);
    }
}
