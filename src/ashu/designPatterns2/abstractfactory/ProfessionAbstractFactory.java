package src.ashu.designPatterns2.abstractfactory;

import src.ashu.designPatterns2.factory.GmailInviteSender;
import src.ashu.designPatterns2.factory.MailSender;
import src.ashu.designPatterns2.factory.OutlookInviteSender;

public class ProfessionAbstractFactory extends AbstractFactory{
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equals("DOCTOR")) {
            return new Doctor();
        } else if (typeOfProfession.equals("TEACHER")) {
            return new Teacher();
        }
        return null;
    }
}


