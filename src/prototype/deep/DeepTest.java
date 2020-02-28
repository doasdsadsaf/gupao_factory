package prototype.deep;

public class DeepTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 现在还是浅复制 齐天大圣里的金箍棒是同一个 为true
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
        System.out.println("浅复制==="+(qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));
        //
        System.out.println("浅复制==="+(qiTianDaSheng == clone));

        /**
         * 深复制
         */
        // 现在还是浅复制 齐天大圣里的金箍棒是同一个 为true
        QiTianDaSheng qiTianDaSheng2 = new QiTianDaSheng();
        QiTianDaSheng clone2 = (QiTianDaSheng)qiTianDaSheng.deepClone();
        System.out.println(qiTianDaSheng2.getJinGuBang() == clone2.getJinGuBang());
        //
        System.out.println(qiTianDaSheng2 == clone2);
    }
}
