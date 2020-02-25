package singleton.huangry;

/**
 * 饿汉式
 */
public class Huangry {

    private Huangry(){}
    private static Huangry huangry = new Huangry();
    public static Huangry getHuangry(){
        return huangry;
    }

}
