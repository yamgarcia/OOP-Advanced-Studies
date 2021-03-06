package ca.bcit.comp2526;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 */
public class DefaultAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(final String animalType) throws InvalidAnimalException {
        final Animal animal;

        switch(animalType){
            case "Cat":
                animal = new Cat();
                break;
            case "Dog":
                animal = new Dog();
                break;
            default:
                throw new InvalidAnimalException(animalType);
        }
        return animal;
    }
}
