package BuilderDesignPattern;

public abstract class AnimalToyBuilder {

    private AnimalToy animalToy;

    public AnimalToy getAnimalToy() {
        return animalToy;
    }

    public void setAnimalToy(AnimalToy animalToy) {
        this.animalToy = animalToy;
    }

    //template method - it defines what steps we have to follow in order to create Animal Toy.
    public final AnimalToy buildAnimalToy(){
        AnimalToy animalToy = createAnimalToy();
        setAnimalToy(animalToy);
        buildAnimalHead();
        buildAnimalBody();
        buildAnimalArms();
        buildAnimalLegs();
        buildAnimalTail();
        setAnimalToyName();
        return animalToy;
    }

    public abstract void buildAnimalHead();

    public abstract void buildAnimalBody();

    public abstract void buildAnimalArms();

    public abstract void buildAnimalLegs();

    public abstract void buildAnimalTail();

    public abstract void setAnimalToyName();

    public abstract AnimalToy createAnimalToy();

}
