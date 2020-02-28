package proxy.static_test;

/**
 * 代理类
 */
public class Father {

    private Person person;

    public Father(Person person){
        this.person = person;
    }

    // 把目标对象的引用给拿到
    public void findLove(){
        System.out.println("根据你的要求物色");
        this.person.findLove();
        System.out.println("双方父母是否同意");
    }


}
