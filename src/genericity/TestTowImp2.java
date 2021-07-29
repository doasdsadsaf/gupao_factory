package genericity;

/**
 * @创建人 dw
 * @创建时间 2021/7/9
 * @描述
 */

import java.util.List;

/**
 * 子类不明确泛型类的类型参数变量:
 *      实现类也要定义出<T>类型的
 *
 */
public class TestTowImp2<T> implements TestTwo<T>{
    @Override
    public <T> void show(T t1) {

    }

    /**
     *  ? 泛型通配符
     * @param list
     */
    // list集合装载的元素只能是String的子类或自身 限定下限
    public void list(List<? extends String> list){
    }

    // list集合装载的元素只能是Inreger的父类或自身 向上限定
    public void list2(List<? super Integer> list){
    }

}
