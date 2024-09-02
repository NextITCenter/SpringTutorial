package kr.or.nextit.springtutorial.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryExample {
    public static void main(String[] args) {
        /*
//        NotificationService noti = new EmailNotificationService();
        NotificationService noti = new SMSNotificationService();
        Library library = new Library(noti);
        library.borrowBook("spring 5");// 대출: spring 5
        library.returnBook("spring 5");// 반납: spring 5
         */
        // 스프링 xml로 변경, 스프링 annotation으로 변경
//        ApplicationContext context = new ClassPathXmlApplicationContext("library-context.xml");
//        Library library = context.getBean("library", Library.class);
//        library.borrowBook("스프링 5");
//        library.returnBook("스프링 5");

    }
}
