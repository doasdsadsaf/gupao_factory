package factory_method;

/**
 * 继承了动物类的猫
 */
public class Cat implements Animal {
    @Override
    public void getNmae() {
        System.out.println("我是一只猫");
    }
}
