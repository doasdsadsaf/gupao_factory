package proxy.jdk;

import proxy.static_test.Person;
import proxy.static_test.Son;

public class XieMu implements Person {

    public void findLove(){
        System.out.println("高富帅");
        System.out.println("3个180");
        System.out.println("六块腹肌");

    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买东西");
    }

    @Override
    public void findJob() {
        System.out.println("月薪13-15K");
        System.out.println("找工作");
    }

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public String getAge() {
        return "";
    }
}
