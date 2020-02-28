package singleton.lazy;

/**
 * 使用静态内部类的方式 做单例
 *内部类一定是在方法调用前被初始化
 *
 * 兼顾了饿汉式的内存浪费和线程安全 使用synchronized的性能问题
 * 最牛逼的单例模式的实现
 */
public class LazyThree {

    public static LazyThree getInstance() {
        return LazyHolder.LAZY;
    }

    // 默认使用LazyThree的时候,会先初始化内部类
    // 如果没使用,内部类不会被加载

    // 每一个关键字都不是多余的
    // static 是为了使单例的空间共享
    // final 保证这个方法不会被重写,重载
    private static final class LazyHolder {
        private static final LazyThree LAZY = new LazyThree();
    }
}
