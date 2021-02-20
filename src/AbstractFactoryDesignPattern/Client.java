package AbstractFactoryDesignPattern;

public class Client {

    public static void main(String[] args){
        AnimalFactory animalFactory = null;
        Animal animal = null;
        String speakSound = null;

        //Get the factory object by passing the factory type
        animalFactory = AnimalFactory.getAnimalFactory("sea");
        System.out.println("Animal Factory Type :- "+animalFactory.getClass().getName());
        System.out.println();

        //Get animal object by passing animal type
        animal = animalFactory.getAnimal("shark");
        System.out.println("Animal Type :- "+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Shark speak :-"+speakSound);

        System.out.println();

        animal = animalFactory.getAnimal("octopus");
        System.out.println("Animal Type :- "+animal);
        speakSound = animal.speak();
        System.out.println("Octopus Speak :- "+speakSound);

        System.out.println("-----------------------------------------");

        //Get factory by passing the factory type
        animalFactory = AnimalFactory.getAnimalFactory("land");
        System.out.println("Animal Factory Type :- "+animalFactory.getClass().getName());
        System.out.println();

        //Get animal object by passing the animal type
        animal = animalFactory.getAnimal("cat");
        System.out.println("Animal Type :- "+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Animal Speak :- "+speakSound);

        System.out.println();

        animal = animalFactory.getAnimal("dog");
        System.out.println("Animal Type :- "+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Animal Speak :- "+speakSound);

        System.out.println();

        animal = animalFactory.getAnimal("lion");
        System.out.println("Animal Type :- "+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Animal Speak :- "+speakSound);

    }
}
