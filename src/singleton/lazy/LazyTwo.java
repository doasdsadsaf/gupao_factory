package singleton.lazy;

/**
 * 懒汉式单例 这次加了线程锁 但是性能变低了
 */
public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazy = null;

    public static synchronized LazyTwo getLazy(){
        if(lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
