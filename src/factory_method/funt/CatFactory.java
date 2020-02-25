package factory_method.funt;

import factory_method.Animal;
import factory_method.Cat;

/**
 * 猫的工厂就只叫猫
 */
public class CatFactory implements Factory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
