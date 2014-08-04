package info.liangsheng.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by liangsheng on 6/3/14.
 */
public class Main {
    public static void main(String[] args) throws Exception{

        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            Future<String> result = exec.submit(new TaskWithResult(i));
            results.add(result);
        }
        for(Future<String> f:results){
           if(f.isDone()){
                System.out.println(f.get());
            }else{
                System.out.println("Future result is not yet complete");
            }
        }

        exec.shutdown();

    }


}

class TaskWithResult implements Callable<String>{
    private int id;

    TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        if(id%2 == 0)
            Thread.sleep(10000);
        return "result of TaskWithResult " + id;
    }
}


