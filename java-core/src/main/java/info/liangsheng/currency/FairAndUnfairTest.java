package info.liangsheng.currency;

import java.util.concurrent.locks.Lock;

/**
 * Created by zhong on 8/16/16.
 */
public class FairAndUnfairTest {

    private static Lock fairLock;
    private static Lock unfairLock;


    private static class Job extends Thread{
        @Override
        public void run() {

        }
    }
}
