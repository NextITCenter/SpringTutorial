package kr.or.nextit.springtutorial.library;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("[이메일 알림]" + message);
    }
}
