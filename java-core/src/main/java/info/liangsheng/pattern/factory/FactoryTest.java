package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender1 = factory.produce("mail");
        sender1.send();
        Sender sender2 = factory.produce("sms");
        sender2.send();


        MutipileMethodFactory factory1 = new MutipileMethodFactory();
        factory1.produceMailSender().send();

        StaticFactory.produceMailSender().send();
        StaticFactory.produceSmsSender().send();

        AbstractFactory factory2 = new MailFactory();
        factory2.produce().send();
        AbstractFactory factory3 = new SmsFactory();
        factory3.produce().send();

    }
}
