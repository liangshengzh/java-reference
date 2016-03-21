package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class StaticFactory {
    public static Sender produceMailSender(){
        return new MailSender();
    }
    public static Sender produceSmsSender(){
        return new SmsSender();
    }
}
