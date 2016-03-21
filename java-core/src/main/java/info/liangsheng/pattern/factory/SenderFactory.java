package info.liangsheng.pattern.factory;

/**
 * Created by zhonlian on 2016/3/21.
 */
public class SenderFactory {
   public Sender produce(String type){
       if("mail".equals(type)){
           return new MailSender();
       }else if("sms".equals(type)){
           return new SmsSender();
       }else{
           System.out.println("Unknown type");
           return  null;
       }
   }
}
