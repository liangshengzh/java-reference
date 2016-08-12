package info.liangsheng.jcip;

/**
 * Created by zhonlian on 2016/8/11.
 */
public class UnsafeSequence {
    private int value;

    public int next(){
        return value++;
    }
}
