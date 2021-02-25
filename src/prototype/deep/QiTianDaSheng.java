package prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends  Monkey implements Cloneable, Serializable {

    private JinGuBang jinGuBang;
    public QiTianDaSheng(){
        this.setBirthday(new Date());
        this.setJinGuBang(new JinGuBang());
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    public Object clone() throws CloneNotSupportedException {
         return super.clone();
    }

    /**
     * 采用序列化的方式深复制
     * @return
     */
    public Object deepClone() {
        try {
            // 通过字节码读出来 序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.setBirthday(new Date());
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
