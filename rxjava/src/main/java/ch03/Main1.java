package ch03;

import rx.Observable;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhonlian on 2016/4/20.
 */
public class Main1 {
    public static void main(String[] args) {
        List  list = Arrays.asList("white","blue","grey");
        Observable<String> observable = Observable.from(list);

        observable.subscribe(System.out::println);

        observable.subscribe(color-> System.out.println(color),System.out::println, System.out::println );


        Path resources = Paths.get("src","main","resources");
        try{
            DirectoryStream<Path>  stream  = Files.newDirectoryStream(resources);
            Observable<Path> dirObserable = Observable.from(stream);
            dirObserable.subscribe(System.out::print);
        }catch (Exception e){
            e.printStackTrace();
        }

        Observable<Integer> observable1 = Observable.from(new Integer[]{1,2,3,4,5});
        observable1.subscribe(System.out::println);


        Observable.just("S").subscribe(System.out::println);
        Observable.just("D").subscribe(System.out::println,System.out::println,System.out::println);

        Observable.just(new User("LS","ZH")).map(u -> u.getForName() + " " + u.getLastName()).subscribe(System.out::println);

    }
}
