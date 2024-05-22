package src.ashu.designPatterns2.factory;

public class Main {


    public static void main(String[] args) {

        // design patterns :
        // 1. Solve existing problems

//        1. Object Creation
//          1.1 : Singleton
//          1.2 : Factory  ----------------
//          1.3 : Abstract Factory --------
//          1.4 : Builder
//          1.5 : Prototype
//        2. Behavioural
//        3. Structral
//        4. J2EE


//        MailSender mailSender = new GmailInviteSender();
//        mailSender.sendEmail();

        MailFactory mailFactory = new MailFactory();
        MailSender mailSender = mailFactory.getEmailInvite("OUTLOOK");
        mailSender.sendEmail();
    }
}
