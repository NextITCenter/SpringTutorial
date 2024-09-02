package kr.or.nextit.springtutorial.library;

public class Library {
    private NotificationService notificationService;

    public Library(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void borrowBook(String bookTitle) {
        notificationService.sendNotification("대출: " + bookTitle);
    }
    public void returnBook(String bookTitle) {
        notificationService.sendNotification("반납: " + bookTitle);
    }
}
