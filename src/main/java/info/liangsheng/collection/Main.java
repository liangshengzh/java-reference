package info.liangsheng.collection;

import java.util.*;

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

        System.out.println("-------------------------------------------------");
        //remove duplicate values from hash table
        Hashtable<String,Dog> table  = new Hashtable<String,Dog>();
        table.put("d1",d1);
        table.put("d2",d2);
        table.put("d3",d3);
        table.put("d4",d4);
        System.out.println(table);
        Hashtable<String,Dog> htable = new Hashtable<String, Dog>();
        for(Map.Entry<String,Dog> entry:table.entrySet()){
          if(!htable.containsValue(entry.getValue())){
              htable.put(entry.getKey(), entry.getValue());
          }
        }
        System.out.println(htable);

       List<Map.Entry<String,Dog>> dogEntryList = new ArrayList<Map.Entry<String, Dog>>(table.entrySet());
       Collections.sort(dogEntryList,new Comparator<Map.Entry<String, Dog>>() {
           @Override
           public int compare(Map.Entry<String, Dog> o1, Map.Entry<String, Dog> o2) {
               return o1.getValue().color.compareTo(o2.getValue().color);
           }
       });
        System.out.println(dogEntryList);
        for(int i = 0 ;i <dogEntryList.size() -1; i++){
            Map.Entry<String, Dog>  curr = dogEntryList.get(i);
            Map.Entry<String, Dog>  next = dogEntryList.get(i+1);
            if(curr.getValue().equals(next.getValue())){
                table.remove(curr.getKey());
            }
        }
        System.out.println(table);

        HashSet<Dog> dogs = new HashSet<Dog>();
       for(Iterator it = table.entrySet().iterator();it.hasNext();)  {
           Map.Entry<String, Dog>  entry =(Map.Entry<String, Dog>  ) it.next();
           if(!dogs.add(entry.getValue())){
               it.remove();
           }
       }
        System.out.println(table);
    }
}
