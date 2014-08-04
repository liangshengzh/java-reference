package spring.aop;

/**
 * Created by liangsheng on 6/3/14.
 */
public class ActivationService {
    public void getActivation(){
        System.out.println("ActivationService.getActivation");
         int i = 1/0;
    }
}
