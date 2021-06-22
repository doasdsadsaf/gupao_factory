package adapter.passport;

import java.util.Map;

/**
 * @创建人 dw
 * @创建时间 2021/6/21
 * @描述
 */
public class Test<T> {

    public T get(T t) {
        return t;
    }

    public <K, V> Map<K, V> getMap(Map<K, V> map) {
        return map;
    }



}
