package src.ashu.designPatterns2.factory;

public class MailFactory {

    public MailSender getEmailInvite(String typeOfInvite) {
        if (typeOfInvite.equals("GMAIL")) {
            return new GmailInviteSender();
        } else if (typeOfInvite.equals("OUTLOOK")) {
            return new OutlookInviteSender();
        }
        return null;
    }
}
