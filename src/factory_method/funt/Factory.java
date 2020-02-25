package factory_method.funt;

import factory_method.Animal;

/**
 * 工厂模型
 */
public interface Factory {

    //工厂必然具有生产产品技能,统一的产品出口
     Animal getAnimal();
}
