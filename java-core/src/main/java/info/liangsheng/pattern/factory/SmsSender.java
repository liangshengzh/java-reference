package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class SmsSender implements  Sender{
    public void send() {
        System.out.println("Send by sms");
    }
}
