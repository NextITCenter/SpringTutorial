package kr.or.nextit.springtutorial.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

// 스프링에서 빈으로 관리하는 클래스임을 선언
//@Configuration
public class RestaurantConfig {
    @Bean
    public Restaurant restaurant() {
        Restaurant restaurant = new Restaurant("아웃백", "대전 중구 계룡로 824", "042-718-5567");
        List<Chef> chefs = new ArrayList<>();
        chefs.add(chef1());
        chefs.add(chef2());
        restaurant.setChefs(chefs);
        return restaurant;
    }
    @Bean
    public Chef chef1() {
        return new Chef("미소", 20);
    }
    @Bean
    public Chef chef2() {
        return new Chef("쵸파", 25);
    }
}
