package FactoryDesignPattern;

/**
 * In factory pattern, we create object without exposing the creation logic to the client
 * and refer to newly created object using a common interface.
 * In simple words, we have a super class and n number of sub classes and based on data provided
 * we have to return the object of one of the sub classes.
 * At run time, we get object based on the parameter we pass.
 */

public class Client {

    public static void main(String [] args){

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = null;
        String speakSound = null;

        animal = animalFactory.getAnimal("dog");
        System.out.println("Animal Type :-"+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Dog Speak :-"+speakSound);

        animal = animalFactory.getAnimal("duck");
        System.out.println("Animal Type :-" +animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Duck Speak :-"+speakSound);

        animal = animalFactory.getAnimal("Lion");
        System.out.println("Animal Type :-"+animal.getClass().getName());
        speakSound = animal.speak();
        System.out.println("Lion Speak :-"+speakSound);

    }
}
