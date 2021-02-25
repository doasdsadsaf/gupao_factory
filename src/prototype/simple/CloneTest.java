package prototype.simple;

import java.util.ArrayList;

/**
 * 测试原型类 浅克隆
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setName("tom");

        prototype.setList(new ArrayList());
        prototype.getList().add("1");

        Object o  = (Prototype)prototype.close();
        System.out.println(((Prototype) o).getName());
        System.out.println(((Prototype) o).getName()==prototype.getName());
        System.out.println(((Prototype) o).getName()=="tom");

    }
}
