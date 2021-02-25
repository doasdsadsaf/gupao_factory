package singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 */
public class RegisterMap {

    private RegisterMap(){}
    // 这个是线程不安全的
    // private static Map<String,Object> register = new HashMap<>(10);
    // 这个是线程安全的
    private static Map<String,Object> register = new ConcurrentHashMap<>(10);
    public static RegisterMap getInstance(String name){
        //
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name) == null){
            register.put(name,new RegisterMap());
        }
        return (RegisterMap) register.get(name);
    }

}
