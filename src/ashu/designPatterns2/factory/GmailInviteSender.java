package src.ashu.designPatterns2.factory;

public class GmailInviteSender implements MailSender {
    @Override
    public void sendEmail() {
        System.out.println("Sending from Gmail......");
    }
}
