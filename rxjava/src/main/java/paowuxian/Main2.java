package paowuxian;

import rx.Observable;
import rx.functions.Action1;

import java.util.Arrays;

/**
 * Created by zhonlian on 2016/5/16.
 */
public class Main2 {

    public static void main(String[] args) {
        String[] message={"a","c","c","d"};

        Observable observable = Observable.from(message);
        observable.subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        });
    }
}
