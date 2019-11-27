package pl.coderslab;

public class Main {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();

        MessageSender messageSender = new MessageSender(emailService);

        SmsService smsService = new SmsService();

        MessageSender messageSender1 = new MessageSender(smsService);

        messageSender.sendMessage();

        messageSender1.sendMessage();
    }
}
