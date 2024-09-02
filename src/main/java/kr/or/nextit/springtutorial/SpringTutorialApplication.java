package kr.or.nextit.springtutorial;

import kr.or.nextit.springtutorial.aop.AOPMethod;
import kr.or.nextit.springtutorial.cafe.Cafe;
import kr.or.nextit.springtutorial.cafe.Coffee;
import kr.or.nextit.springtutorial.di.Restaurant;
import kr.or.nextit.springtutorial.library.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:restaurant-context.xml")
public class SpringTutorialApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
		AOPMethod aopMethod = context.getBean("aopMethod", AOPMethod.class);
		aopMethod.method4();

		Cafe cafe = context.getBean("cafe", Cafe.class);
		Coffee coffee = cafe.orderCoffee(4000);
		System.out.println(coffee);
	}

}
