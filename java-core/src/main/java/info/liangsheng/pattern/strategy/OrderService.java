package info.liangsheng.pattern.strategy;

import info.liangsheng.pattern.template.OrderItem;
import info.liangsheng.pattern.template.SpendingLimitViolationException;

/**
 * Created by zhong on 7/13/16.
 */
//public class OrderService {
//
//    private DataHelper dataHelper;
//    private static final int DISCOUNT_THRESHOLD = 10000;
//
//
//    public void setDataHelper(DataHelper dataHelper) {
//        this.dataHelper = dataHelper;
//    }
//
//
//    public final void placeOrder(Integer customerId, OrderItem[] items ){
//        int total = 0;
//        for(int i = 0; i < items.length; i++){
//            total += dataHelper.getItemPrice(items[i]);
//        }
//
//
//        int limit = dataHelper.getSpendLimit(customerId);
//        if(total > limit){
//            throw  new SpendingLimitViolationException(total, limit);
//        }
//
//        if(total > DISCOUNT_THRESHOLD){
//
//        }
//
//        placeOrder(customerId, total, items);
//    }
//
//}
