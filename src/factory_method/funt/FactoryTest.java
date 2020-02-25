package factory_method.funt;

import factory_method.Animal;

/**
 * 复杂工厂模式
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new CatFactory();
        factory.getAnimal().getNmae();
    }
}
