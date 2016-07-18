package info.liangsheng.pattern.strategy;

import info.liangsheng.pattern.template.OrderItem;

/**
 * Created by zhong on 7/13/16.
 */
public interface DataHelper {
    int getSpendLimit(Integer customerId);
    int getItemPrice(OrderItem item);
    void placeOrder(Integer customerId, int total, OrderItem[] items);
}
