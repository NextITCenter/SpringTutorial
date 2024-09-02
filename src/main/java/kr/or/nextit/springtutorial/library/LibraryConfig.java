package kr.or.nextit.springtutorial.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public NotificationService notificationService() {
        return new EmailNotificationService();
    }

    @Bean
    public Library library() {
        Library library = new Library(notificationService());
        library.borrowBook("이펙티브 자바");
        library.returnBook("이펙티브 자바");
        return library;
    }
}
