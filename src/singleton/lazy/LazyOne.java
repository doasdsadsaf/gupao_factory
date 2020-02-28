package singleton.lazy;

/**
 * 懒汉式单例 有线程安全隐患 可以加锁 synchronized 解决 但是会降低性能
 *
 * 在外部需要使用的时候才进行实例化
 */
public class LazyOne {

    private LazyOne(){}

    // 静态块,公共内存区域
    private static LazyOne lazy = null;

    public static synchronized LazyOne getLazy(){
        // 调用方法之前,先判断
        //  如果没有初始化,才将其初始化,进行赋值
        // 将该实例缓存好
        if(lazy == null){
            // 如果在一瞬间两个线程调用这个,
            // 两个线程都会进入if里面 这时候就会出现线程安全问题
            lazy = new LazyOne();
        }
        // 如果已经初始化,直接返回之前已经初始化的实力
        return lazy;
    }
}
