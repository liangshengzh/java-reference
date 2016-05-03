package ch03;

import rx.Observable;
import rx.Subscriber;

import java.util.Iterator;

/**
 * Created by zhonlian on 2016/4/20.
 */
public class Main3 {

    <T> Observable<T> from(Iterable<T> iterable){
        return Observable.create(new Observable.OnSubscribe<T>() {
            @Override
            public void call(Subscriber<? super T> subscriber) {
                try{
                    Iterator<T> iterator = iterable.iterator();
                    while (iterator.hasNext()){
                        subscriber.onNext(iterator.next());
                    }
                    subscriber.onCompleted();
                }catch (Exception e){
                    subscriber.onError(e);
                }
            }
        });
    }
}
