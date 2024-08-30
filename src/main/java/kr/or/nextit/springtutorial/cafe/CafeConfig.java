package kr.or.nextit.springtutorial.cafe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeConfig {
    @Bean
    public CoffeeMachine espressoCoffeeMachine() {
        return new EspressoCoffeeMachine();
    }
    @Bean
    public Barista barista() {
        return new Barista(espressoCoffeeMachine());
    }
    @Bean
    public Cafe cafe() {
        return new Cafe(barista());
    }
}
