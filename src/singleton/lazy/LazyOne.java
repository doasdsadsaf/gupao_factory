package singleton.lazy;

/**
 * 懒汉式单例 有线程安全隐患
 */
public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazy = null;

    public static LazyOne getLazy(){
        if(lazy == null){
            lazy = new LazyOne();
        }
        return lazy;
    }
}
