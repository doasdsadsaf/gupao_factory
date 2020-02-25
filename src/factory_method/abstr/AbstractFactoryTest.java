package factory_method.abstr;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        // 对用户而言 更简单了
        // 用户只有选择的权利
        animalFactory.getCat().getNmae();
    }
}

