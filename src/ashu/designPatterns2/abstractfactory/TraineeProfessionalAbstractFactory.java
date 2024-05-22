package src.ashu.designPatterns2.abstractfactory;

public class TraineeProfessionalAbstractFactory extends AbstractFactory{

    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equals("DOCTOR")) {
            return new TraineeDoctor();
        } else if (typeOfProfession.equals("TEACHER")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
