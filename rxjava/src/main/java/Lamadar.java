import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by zhong on 4/12/16.
 */
public class Lamadar {

    interface Mapper<V, M>{
        M map(V value);
    }

    public static <V,M> List<M> map(List<V> list, Mapper<V,M> mapper){
        List<M> mapped = new ArrayList<M>(list.size());
        for(V v:list){
            mapped.add(mapper.map(v));
        }
        return mapped;
    }

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1","2","3","4");
        List<Integer>  mapped  = map(numbers, new Mapper<String, Integer>() {
            public Integer map(String value) {
                return Integer.parseInt(value);
            }
        });

        List<Double> doubles = map(numbers, value-> Double.parseDouble(value));
        System.out.println(mapped);
        System.out.println(doubles);
    }
}
