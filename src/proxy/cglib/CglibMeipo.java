package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){

        Enhancer enhancer = new Enhancer();
        // 要把哪个类设置为即将生成的新父类
        enhancer.setSuperclass(clazz);
        // 设置回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 对业务的增强
        System.out.println("我是ccc");
        methodProxy.invokeSuper(o,objects);
        System.out.println("如果ccc");
        return o;
    }
}
