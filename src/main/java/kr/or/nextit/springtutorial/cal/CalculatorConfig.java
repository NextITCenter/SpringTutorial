package kr.or.nextit.springtutorial.cal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public Calculator forLoop() {
        return new ForLoop();
    }

    @Bean
    public Calculator recursive() {
        return new Recursive();
    }

    @Bean
    public CalculatorAdvice advice() {
        return new CalculatorAdvice();
    }
}
