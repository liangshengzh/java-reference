package info.liangsheng.pattern;

/**
 * Created by liangsheng on 8/13/14.
 */
public class PCMain {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer p1 = new Producer(storage);
        Producer p2 = new Producer(storage);
        Producer p3 = new Producer(storage);
        Producer p4 = new Producer(storage);
        Producer p5 = new Producer(storage);
        Producer p6 = new Producer(storage);


        Consumer c1 = new Consumer(storage);
        Consumer c2 = new Consumer(storage);
        Consumer c3 = new Consumer(storage);
        Consumer c4 = new Consumer(storage);

        p1.setNum(100);
        p2.setNum(10);
        p3.setNum(34);
        p4.setNum(40);
        p5.setNum(59);
        p6.setNum(79);

        c1.setNum(10);
        c2.setNum(30);
        c3.setNum(50);


        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        c1.start();
        c2.start();
        c3.start();

    }
}
