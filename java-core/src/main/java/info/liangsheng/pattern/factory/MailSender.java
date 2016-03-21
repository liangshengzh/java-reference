package info.liangsheng.pattern.factory;

/**
 * Created by zhong on 3/21/16.
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("Send by mail");
    }
}
