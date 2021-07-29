package genericity;

/**
 * @创建人 dw
 * @创建时间 2021/7/8
 * @描述
 */
/*
    把泛型定义在接口上
 */
public interface TestTwo<T>{

    <T> void show(T t);
}
