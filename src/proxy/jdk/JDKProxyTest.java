package proxy.jdk;

import proxy.static_test.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.sql.SQLOutput;

/**
 * 代理模式测试类
 *
 * 原理:
 * 1.拿到被代理对象的引用,并且获取它的所有的接口,使用反射回去
 * 2. 通过JDK Proxy类重新生成一个新的类,同时这个新的类要实现被代理类所实现的所有的接口
 * 3. 动态生成java代码,把新加的业务逻辑方法由一定的逻辑代码去调用(在代码中提现)
 * 4. 编译新生成的java代码,class
 * 5. 再重新加载到JVM中运行
 * 以上这个过程就叫字节码重组
 *
 * JDK 有个规范,只要是$开头的一般都是自动生成的
 *
 * */
public class JDKProxyTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //findLoveTest();
        findJob();

        // TODO 通过反编译工具可以查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }

    /**
     * 调用找对象
     */
    private static void findLoveTest() {
        // 代理找对象
        Person object  = (Person)new JDKMeiPo().getInstance(new XieMu());
        System.out.println(object);
        object.findLove();
    }

    /**
     * 调用找工作
     */
    private static void findJob() {
        // 代理找对象
        Person object  = (Person)new JDKMei58().getInstance(new XieMu());
        System.out.println(object);
        object.findJob();
    }
}
