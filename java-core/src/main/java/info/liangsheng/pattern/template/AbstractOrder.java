package info.liangsheng.pattern.template;

/**
 * Created by zhong on 7/13/16.
 */

/**
 * 超类集中于业务逻辑的控制,子类集中于实现基本的操作. 这提供了关系的有效分离.
 */
public abstract  class AbstractOrder {

    private static final int DISCOUNT_THRESHOLD = 10000;

    public final void placeOrder(Integer customerId, OrderItem[] items ){
        int total = 0;
        for(int i = 0; i < items.length; i++){
            total += getItemPrice(items[i]);
        }


        int limit = getSpendLimit(customerId);
        if(total > limit){
            throw  new SpendingLimitViolationException(total, limit);
        }

        if(total > DISCOUNT_THRESHOLD){

        }

        placeOrder(customerId, total, items);
    }



    protected abstract int getSpendLimit(Integer customerId);

    protected abstract int getItemPrice(OrderItem item);
    protected abstract void placeOrder(Integer customerId, int total, OrderItem[] items);
}
