package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class MutipileMethodFactory  {

    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
       return  new SmsSender();
    }
}
