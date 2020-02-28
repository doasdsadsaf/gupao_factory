package prototype.simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式 克隆 clone类
 */
public class Prototype implements Cloneable {

    private String name;

    private List<String> list = new ArrayList<>();

    public Object close() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
