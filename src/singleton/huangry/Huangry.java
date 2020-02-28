package singleton.huangry;

/**
 * 饿汉式
 *  它是在类加载的时候就立即初始化,并且创建单例对象
 *
 *
 *  优点: 没有加任何的锁,执行效率比较高,
 *  在用户体验上来说,比懒汉式更好
 *  绝对线程安全
 *
 *  缺点:类加载的时候就初始化,不管你用还是不用,都占着空间
 *       浪费内存,有可能占着茅坑不拉屎
 */
public class Huangry {

    private Huangry() {
    }

    private static Huangry huangry = new Huangry();

    public static Huangry getHuangry() {
        return huangry;
    }

}
