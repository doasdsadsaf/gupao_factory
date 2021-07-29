package genericity;

import adapter.passport.Test;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @创建人 dw
 * @创建时间 2021/7/8
 * @描述
 */
public class TestMain {

    public static void main(String[] args) {
        TestOne<Integer> testOne = new TestOne<>();
        testOne.setT(1);
        System.out.println(testOne.getT());

        //调用方法,传入的参数是什么类型,返回值就是什么类型

        testOne.show("2");

        TestTwoImpl testTwo = new TestTwoImpl();
        testTwo.show(1);

    }
}
