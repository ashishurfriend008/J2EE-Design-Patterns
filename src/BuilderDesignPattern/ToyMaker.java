package BuilderDesignPattern;

public class ToyMaker {

    public final static String DOG_TOY = "Dog";
    public final static String LION_TOY = "Lion";

    public static AnimalToy makeToy(String toyType) throws Exception{

        AnimalToyBuilder animalToyBuilder = null;

        if(toyType.equalsIgnoreCase(DOG_TOY)){
                animalToyBuilder = new DogToyBuilder();
        }else if(toyType.equalsIgnoreCase(LION_TOY)){
                animalToyBuilder = new LionToyBuilder();
        }else{
            System.out.println("Sorry we can't make :- " +toyType);
            throw new Exception("Sorry we can't make :- " +toyType);
        }
        return animalToyBuilder.buildAnimalToy();
    }

}
