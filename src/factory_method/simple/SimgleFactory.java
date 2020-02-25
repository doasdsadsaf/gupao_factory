package factory_method.simple;

import factory_method.Animal;
import factory_method.Cat;
import factory_method.Dog;

/**
 * 一个工厂类,你要什么动物 就给你什么动物
 */
public class SimgleFactory {

    public Animal getAnimal(String name){
        if("cat".equals(name)){
            return new Cat();
        }else if("dog".equals(name)){
            return new Dog();
        }
        return null;
    }
}
