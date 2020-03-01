package strategy;

import strategy.payport.PayMoney;

import java.math.BigDecimal;

public class PayStrategyTest {

    public static void main(String[] args) {
        // 省略了吧商品添加到购物车,再从购物车下单
        // 直接从点单开始
        Order order = new Order("1","2020022901",new BigDecimal(1));

        // 开始支付,选择微信,支付宝,银联
        // 每个渠道它支付的具体算法是不一样的
        // 基本算法是固定的,
        System.out.println(order.pay(PayType.ALI_PAY));
    }
}
