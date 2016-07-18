package ch04;

import rx.Observable;

/**
 * Created by zhonlian on 2016/5/16.
 */
public class Map {
    public static void main(String[] args) {
        Observable<String> mapped =  Observable
                .just(2, 3, 5, 8)
                .map(v -> v * 3)
                .map(v -> (v % 2 == 0 ? "even" : "odd"));

        subscriblePrint(mapped, "map");
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
