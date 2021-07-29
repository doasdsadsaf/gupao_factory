package genericity;

/**
 *  定义泛型类
 *  
 * @创建人 dw
 * @创建时间 2021/7/8
 * @描述
 */
public class TestOne<T> {
    private T t;

    //定义泛型方法..
    // 调用方法,传入的参数是什么类型,返回值就是什么类型
    public  <T> void show(T s){
        System.out.println(s);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
