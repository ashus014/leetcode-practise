package src.ashu.designPatterns2.abstractfactory;

public class AbstractFactoryProducer{

    public static AbstractFactory getProfession(Boolean isTrainee) {

        if(isTrainee) {
            return new TraineeProfessionalAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }

    }
 }
