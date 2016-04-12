import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observables.ConnectableObservable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhong on 4/12/16.
 */
public class Sum {
    public static void main(String[] args) {
        ConnectableObservable<String> input = from(System.in);

        Observable<Double> a = varStream("a", input);
        Observable<Double> b = varStream("b", input);

        ReactiveSum sum = new ReactiveSum(a, b);
        input.connect();


    }
    public static Observable<Double> varStream(final String varName,Observable<String> input){
        final Pattern pattern= Pattern.compile("\\^s*"+varName+"\\s*[:|=]\\s*(-?\\d+\\.?\\d*)$");
        return input.map(new Func1<String, Matcher>() {
            public Matcher call(String s) {
                return pattern.matcher(s);
            }
        }).filter(new Func1<Matcher, Boolean>() {
            public Boolean call(Matcher matcher) {
                return matcher.matches() && matcher.group(1) != null;
            }
        }).map(new Func1<Matcher, Double>() {
            public Double call(Matcher matcher) {
                return Double.parseDouble(matcher.group(1));
            }
        });

    }
    static ConnectableObservable<String> from(final  InputStream stream){
        return  from(new BufferedReader(new InputStreamReader(stream)));
    }
    static ConnectableObservable<String> from (final BufferedReader reader){
        return Observable.create(new Observable.OnSubscribe<String>() {
            public void call(Subscriber<? super String> subscriber) {
                if(subscriber.isUnsubscribed()){
                    return;
                }
                try {
                    String line;
                    while (!subscriber.isUnsubscribed() && (line = reader.readLine()) != null){
                        if(line == null||line.equals("exit")){
                            break;
                        }
                        subscriber.onNext(line);
                    }
                }catch (IOException ioe){
                    subscriber.onError(ioe);
                }

                if(!subscriber.isUnsubscribed()){
                    subscriber.onCompleted();
                }
            }
        }).publish();
    }

    public static final class ReactiveSum implements Observer<Double> {
        private double sum;

        public ReactiveSum(Observable<Double> a, Observable<Double> b) {
            this.sum = 0;
            Observable.combineLatest(a, b, new Func2<Double, Double, Double>() {
                public Double call(Double aDouble, Double bDouble) {
                    return  aDouble + bDouble ;
                }
            }).subscribe(this);
        }

        public void onCompleted() {
            System.out.println("Exiting last sum is :" + this.sum);

        }

        public void onError(Throwable throwable) {
            System.out.println("Got an error");
            throwable.printStackTrace();
        }

        public void onNext(Double sum) {
            this .sum = sum;
            System.out.println("update: a + b =" + sum);
        }
    }
}
