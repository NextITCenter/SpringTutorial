package kr.or.nextit.springtutorial.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AOPConfig {
    @Bean
    public AOPMethod aopMethod() {
        return new AOPMethod();
    }
    @Bean
    public AOPMethodAdvice aopMethodAdvice() {
        return new AOPMethodAdvice();
    }
}
