package kr.or.nextit.springtutorial.library;

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("[SMS 알림]" + message);
    }
}
