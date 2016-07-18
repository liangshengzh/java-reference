package paowuxian;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by zhonlian on 2016/5/16.
 */
public class Main1 {

    Observer<String> observer  = new Observer<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };

    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };


    Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {

        }
    });

    public static void main(String[] args) {

    }

    public void execute(){
        observable.subscribe(subscriber);
    }
}
