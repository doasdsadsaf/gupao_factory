package factory_method.simple;

/**
 * 用户类,使用工厂 小作坊的工厂模式 最简单的
 */
public class SimgleFactoryTest {

    public static void main(String[] args) {
        SimgleFactory simgleFactory = new SimgleFactory();
        // 我想要一只猫
        simgleFactory.getAnimal("cat").getNmae();
        // 我想要一条狗

    }

}
