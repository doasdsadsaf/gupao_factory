package strategy.payport;

import strategy.PayState;

import java.math.BigDecimal;

public interface PayMoney {
    PayState pay(String uid, String orderId, BigDecimal money);

}
