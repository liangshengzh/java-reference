import rx.Observable;

/**
 * Created by zhonlian on 2016/5/16.
 */
public class Print {

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
