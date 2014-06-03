package info.liangsheng.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by liangsheng on 6/3/14.
 */
public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("black");
        Dog d2 = new Dog("white");
        Dog d3 = new Dog("gray");
        Dog d4 = new Dog("black");


        Map<Dog,Integer> map = new HashMap<Dog, Integer>();
        map.values().iterator().remove();
        map.put(d1,10);
        map.put(d2,50);
        map.put(d3,50);
        map.put(d4,20);


        for(Map.Entry<Dog, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("--------------------------------");
        LinkedHashMap<Dog,Integer> linkedHashMap = new LinkedHashMap<Dog, Integer>();
        linkedHashMap.put(d1,10);
        linkedHashMap.put(d2,15);
        linkedHashMap.put(d3,50);
        linkedHashMap.put(d4,20);

        for(Map.Entry entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
