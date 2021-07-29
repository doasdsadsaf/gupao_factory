package genericity;

/**
 * @创建人 dw
 * @创建时间 2021/7/9
 * @描述
 */
/**
 * 子类明确泛型类的类型参数变量
 */
public class TestTwoImpl implements TestTwo<String>{

    @Override
    public <T> void show(T t) {

    }
}
