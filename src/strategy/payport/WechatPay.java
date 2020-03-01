package strategy.payport;

import strategy.PayState;

import java.math.BigDecimal;

/**
 * 支付宝支付类
 */
public class WechatPay implements PayMoney {

    @Override
    public PayState pay(String uid, String orderId, BigDecimal money) {
        System.out.println("欢迎使用微信");
        System.out.println("查询微信账户余额,开始扣款");
        System.out.println("扣款成功");

        return new PayState(200,money,"支付成功");
    }
}
