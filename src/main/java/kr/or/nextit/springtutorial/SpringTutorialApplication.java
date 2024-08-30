package kr.or.nextit.springtutorial;

import kr.or.nextit.springtutorial.di.Restaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:restaurant-context.xml")
public class SpringTutorialApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		System.out.println(restaurant);
	}

}
