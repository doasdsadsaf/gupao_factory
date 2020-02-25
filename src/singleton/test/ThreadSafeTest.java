package singleton.test;

import singleton.huangry.Huangry;
import singleton.lazy.LazyOne;
import singleton.register.RegisterEnum;

import java.util.concurrent.CountDownLatch;

/**
 * 模拟并发类,用于测试单例的好处
 */
public class ThreadSafeTest {

    /**
     * 并发执行
     * for循环每次执行 调用CountDownLatch的countDown,将count-1
     * 到0时,同时执行
     * @param args
     */
    public static void main(String[] args) {
        int count = 100;
        // new 一个用于模拟并发的这个类 这个类会使一个线程等待其他线程各自执行完毕后再执行
        // 如一个循环,本来一个一个执行,现在就会同时执行所有的
        CountDownLatch downLatch = new CountDownLatch(100);
        System.out.println(1);
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    Huangry.getHuangry();
                    try {
                        // 调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行
                        downLatch.await();
                        // 饿汉式 没有线程安全隐患
                       // System.out.println(System.currentTimeMillis()+":"+Huangry.getHuangry());
                        // 懒汉式 有线程安全隐患
                        System.out.println(System.currentTimeMillis()+":"+ LazyOne.getLazy());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            // //将count值减1
            downLatch.countDown();
        }

        RegisterEnum.INSTANCE.getInstance();

    }
}
