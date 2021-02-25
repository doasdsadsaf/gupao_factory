package proxy.static_test;

/**
 * 被代理类 继承接口
 */
public class Son implements Person{

    // 我没有时间
    public void findLove(){
        System.out.println("找对象,肤白貌美大长腿");
    }

    @Override
    public void zufangzi() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void findJob() {

    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }

}
