package factory_method;

/**
 * 继承了动物类的狗
 */
public class Dog implements Animal {
    @Override
    public void getNmae() {
        System.out.println("我是一条狗");
    }
}
