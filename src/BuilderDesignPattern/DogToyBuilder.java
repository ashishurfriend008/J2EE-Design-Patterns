package BuilderDesignPattern;

public class DogToyBuilder extends AnimalToyBuilder {

    @Override
    public void buildAnimalHead() {
        getAnimalToy().setAnimalToyHead("Dog Head");
        System.out.println("Step 1:- Dog head has been build");
    }

    @Override
    public void buildAnimalBody() {
        getAnimalToy().setAnimalToyBody("Dog Body");
        System.out.println("Step 2:- Dog body has been build");
    }

    @Override
    public void buildAnimalArms() {
        getAnimalToy().setAnimalToyArms("No Arms");
        System.out.println("Step 3:- Dog arms has been build");
    }

    @Override
    public void buildAnimalLegs() {
        getAnimalToy().setAnimalToyLegs("Dog has four legs");
        System.out.println("Step 4:- Dog legs has been build");
    }

    @Override
    public void buildAnimalTail() {
        getAnimalToy().setAnimalToyTail("Dog Tail");
        System.out.println("Step 5:- Dog tail has been build");
    }

    @Override
    public void setAnimalToyName() {
        getAnimalToy().setAnimalToyName("Dog");
    }

    @Override
    public AnimalToy createAnimalToy() {
        return new AnimalToy();
    }
}
