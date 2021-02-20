package BuilderDesignPattern;

/**
 * Git hub - https://github.com/ramram43210/Java/tree/master/designpattern/BuilderPattern_AnimalToys
 * Builder Design Pattern - Builder pattern builds a complex object using simple objects by using
 * step by step approach.
 * The process of constructing complex object should be generic so that the same process can be used
 * to create different representation of the same complex object.
 * Builder design pattern falls under the category of creational design pattern.
 */

public class BuilderClient {

    public static void main(String[] args) throws  Exception{
            AnimalToy dogToy = ToyMaker.makeToy(ToyMaker.DOG_TOY);
            System.out.println(dogToy);

            AnimalToy lionToy = ToyMaker.makeToy(ToyMaker.DOG_TOY);
            System.out.println(lionToy);
    }
}
