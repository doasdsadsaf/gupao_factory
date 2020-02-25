package singleton.lazy;

/**
 * 使用静态内部类的方式 做单例
 */
public class LazyThree {
    public static LazyThree getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
