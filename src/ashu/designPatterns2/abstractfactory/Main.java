package src.ashu.designPatterns2.abstractfactory;

public class Main {

    public static void main(String[] args) {

            AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
            Profession profession = abstractFactory.getProfession("TEACHER");
            profession.print();

    }
}
