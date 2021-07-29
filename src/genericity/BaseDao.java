package genericity;

import java.lang.reflect.ParameterizedType;

/**
 * @创建人 dw
 * @创建时间 2021/7/9
 * @描述
 */
public abstract class BaseDao<T> {

    //模拟
    private String session;
    private Class clazz;


    //哪个子类调的这个方法，得到的class就是子类处理的类型（非常重要）
    public BaseDao(){
        // 子类调用这个this.getClass 就是拿到自己
        Class clazz = this.getClass();
        // 返回继承的父类使用参数化类来接收
        ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();  //BaseDao<Category>
        // 获得超类的泛型参数的实际类型
        clazz = (Class) pt.getActualTypeArguments()[0];
        System.out.println(clazz);

    }


}
