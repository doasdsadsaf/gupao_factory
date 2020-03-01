package strategy;

import strategy.payport.AliPay;
import strategy.payport.PayMoney;
import strategy.payport.UnionPay;
import strategy.payport.WechatPay;

/**
 * 把该枚举当做常量维护
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    _WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay());
    private PayMoney payMoney;
    PayType(PayMoney payMoney){
        this.payMoney = payMoney;
    }

    public PayMoney get(){
        return this.payMoney;
    }
}
