package factory_method.abstr;

import factory_method.Animal;

/**
 * 抽象工厂是用户的主入口 可以用于存储公共的逻辑,方便统一管理
 * 在spring5 用的最广泛
 * */
public abstract class AbstractFactory {

    /**
     * 提供猫
     * @return
     */
    public abstract Animal getCat();

    /**
     * 提供狗
     * @return
     */
    public abstract Animal getDog();
}
