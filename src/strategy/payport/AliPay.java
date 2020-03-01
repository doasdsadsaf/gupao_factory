package strategy.payport;

import strategy.PayState;

import java.math.BigDecimal;

/**
 * 支付宝支付类
 */
public class AliPay implements PayMoney {

    @Override
    public PayState pay(String uid, String orderId, BigDecimal money) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额,开始扣款");
        System.out.println("扣款成功");

        return new PayState(200,money,"支付成功");
    }
}
