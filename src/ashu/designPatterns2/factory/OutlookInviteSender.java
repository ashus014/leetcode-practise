package src.ashu.designPatterns2.factory;

public class OutlookInviteSender implements MailSender{
    @Override
    public void sendEmail() {
        System.out.println("Sending from Outlook......");
    }
}
