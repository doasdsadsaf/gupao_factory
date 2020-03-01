package strategy;

import strategy.payport.PayMoney;

import java.math.BigDecimal;

public class Order {
    private String uid;
    private String orderId;
    private BigDecimal money;

    // 这个参数,完全可以用payMoney接口来代替
    // 为什么不这样
    //完美解决了switch的过程,不需要在代码中写switch了
    // 更不需要写if else
    public Order (String uid,String orderId,BigDecimal money){
        this.uid = uid;
        this.orderId = orderId;
        this.money = money;
    }

    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.orderId,this.money);
    }
}
