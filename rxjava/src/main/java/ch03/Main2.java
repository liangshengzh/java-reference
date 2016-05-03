package ch03;

import rx.Observable;

import java.util.concurrent.TimeUnit;


/**
 * Created by zhonlian on 2016/4/20.
 */
public class Main2
{
    public static void main(String[] args) {
        subscriblePrint(Observable.interval(500L, TimeUnit.MILLISECONDS), "Interval Observal");
        subscriblePrint(Observable.timer(0L, 1L, TimeUnit.SECONDS), " Time Interval Observal");
        subscriblePrint(Observable.timer( 1L, TimeUnit.SECONDS), " Time  Observal");
        subscriblePrint(Observable.error(new Exception("Test Error")), "Error Observal");
        while (true){}
    }

    private static <T> void subscriblePrint(Observable<T> observable, String name){
        observable.subscribe(
                (v)-> System.out.println(name + " : "+  v),
                (e)->{
                    System.err.println("Error from " + name);
                    System.err.println(e.getMessage());
                },
                ()-> System.out.println(name + "ended!")
        );
    }
}
