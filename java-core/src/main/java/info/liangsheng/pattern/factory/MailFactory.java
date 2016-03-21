package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class MailFactory implements AbstractFactory {
    public Sender produce() {
        return  new MailSender();
    }
}
