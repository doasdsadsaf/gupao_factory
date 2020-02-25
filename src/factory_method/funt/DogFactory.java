package factory_method.funt;

import factory_method.Animal;
import factory_method.Cat;
import factory_method.Dog;

/**
 * 猫的工厂就只叫猫
 */
public class DogFactory implements Factory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
