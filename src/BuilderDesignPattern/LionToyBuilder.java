package BuilderDesignPattern;

public class LionToyBuilder extends AnimalToyBuilder {

    @Override
    public void buildAnimalHead() {
        getAnimalToy().setAnimalToyHead("Lion Head");
        System.out.println("Step 1:- Lion head has been build");
    }

    @Override
    public void buildAnimalBody() {
        getAnimalToy().setAnimalToyBody("Lion Body");
        System.out.println("Step 2:- Lion body has been build");
    }

    @Override
    public void buildAnimalArms() {
        getAnimalToy().setAnimalToyArms("No arms");
        System.out.println("Step 3:- Lion arms has been build");
    }

    @Override
    public void buildAnimalLegs() {
        getAnimalToy().setAnimalToyLegs("Lion has four legs");
        System.out.println("Step4:- Lion legs has been build");
    }

    @Override
    public void buildAnimalTail() {
        getAnimalToy().setAnimalToyTail("Lion Tail");
        System.out.println("Step5:- Lion tail has been build");
    }

    @Override
    public void setAnimalToyName() {
        getAnimalToy().setAnimalToyName("Lion");
    }

    @Override
    public AnimalToy createAnimalToy() {
        return new AnimalToy();
    }
}
