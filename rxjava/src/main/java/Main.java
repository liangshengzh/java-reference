import rx.Observable;
import rx.functions.Action1;

/**
 * Created by zhong on 4/11/16.
 */
public class Main {
    public static void main(String[] args) {
        hello("Ben","George");


    }

    public  static void hello(String... params){
        Observable.from(params).subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println("Hello " + s +"!" );
            }
        });
    }
}
