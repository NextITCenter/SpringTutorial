package kr.or.nextit.springtutorial.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class RestaurantExample {
    public static void main(String[] args) {
        /*
        Restaurant restaurant = new Restaurant("아웃백", "대전 중구 계룡로 824", "042-718-5567");
        System.out.println(restaurant);
        Chef chef1 = new Chef("미소", 20);
        Chef chef2 = new Chef("쵸파", 25);
        List<Chef> chefs = new ArrayList<>();
        chefs.add(chef1);
        chefs.add(chef2);
        restaurant.setChefs(chefs);
        System.out.println(restaurant);
        */
        // 상속에서 is a, has a ?
        /*
        is a(상속관계): 사람 학생, 학생 대학생, 동물(Animal) 강아지(Dog)
        class Dog extends Animal {}
        has a(포함관계): 은행 고객, 고객 통장, 음식점 요리사, 자동차 타이어
        class Bank {
            Customer[] customers;
        }
        스프링도 컨테이너(Spring Container)가 있다. => 톰캣이 서블릿 컨테이너 역할을 하는 것과 같음
        스프링이 관리하는 객체를 스프링 빈(bean)이라고 한다.
        스프링 컨테이너에 빈을 등록해야하는데 이 때 xml방식과 annotation 방식이 있다.
         */
        // xml 방식 가져올 때
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("restaurant-context.xml");
//        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
//        System.out.println(restaurant);
        // annotation 방식 가져올 때
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        System.out.println(restaurant);
    }
}
