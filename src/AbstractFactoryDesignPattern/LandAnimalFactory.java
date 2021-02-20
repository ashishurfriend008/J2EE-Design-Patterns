package AbstractFactoryDesignPattern;

public class LandAnimalFactory extends AnimalFactory{

    @Override
    public Animal getAnimal(String animalType) {
        Animal animal = null;
        if("cat".equals(animalType)){
            animal = new Cat();
        }else if("dog".equals(animalType)){
            animal = new Dog();
        }else if("lion".equals(animalType)){
            animal  = new Lion();
        }
            return animal;
    }
}
