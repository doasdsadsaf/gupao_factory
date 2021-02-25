package proxy.cglib;

public class CglibTest {
    public static void main(String[] args) {
        ZhangSan instance = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
        String love = instance.findLove();
        System.out.println(love);

    }
}
