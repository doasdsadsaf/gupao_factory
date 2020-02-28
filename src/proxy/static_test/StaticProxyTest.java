package proxy.static_test;

/**
 * 测试静态代理类
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Son son = new Son();

        //这时候就只能帮儿子一个人找对象,没法扩展了
        Father father = new Father(son);
        father.findLove();

    }
}
