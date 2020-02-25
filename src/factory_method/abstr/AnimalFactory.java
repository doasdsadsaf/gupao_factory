package factory_method.abstr;

import factory_method.Animal;
import factory_method.Cat;
import factory_method.Dog;
import factory_method.funt.CatFactory;
import factory_method.funt.DogFactory;

public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getCat() {
        return new CatFactory().getAnimal();
    }

    @Override
    public Animal getDog() {
        return new DogFactory().getAnimal();
    }
}
