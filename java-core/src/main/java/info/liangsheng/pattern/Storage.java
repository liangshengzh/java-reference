package info.liangsheng.pattern;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by liangsheng on 8/13/14.
 */
public class Storage {
    private final int MAX_SIZE=100;

    private LinkedList<Object> list = new LinkedList<Object>();

    public void produce(int num){
        synchronized (list){
            while (true){
                if(list.size()+num >MAX_SIZE){
                    System.out.println("Produce Number: "+num +" +  List Size "+ list.size() +" > " +MAX_SIZE + ", Stop produce");
                    try{
                        list.wait();
                        list.notifyAll();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else
                {
                    for(int i=1;i<=num;i++) {
                        list.add(new Object());
                    }
                    System.out.println("Already produce" + num + " List size :" + list.size());

                }
            }

        }
    }

    public void consume(int num){
        synchronized (list){
            while(true){
                if(list.size()<num){
                    System.out.println("Consume Qty: " + num +" List size: " +list.size() +", So stop to consume");
                    try{
                        list.wait();
                        list.notifyAll();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                for(int i =  1; i <= num ; i++){
                    list.remove();
                }
                System.out.println("Already consume: "+num + " List size: " +list.size());

            }

        }
    }
}
