package info.liangsheng.collection;

/**
 * Created by liangsheng on 6/3/14.
 */
public class Dog {
    String color;
    Dog(String color){
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Dog)obj).color==(color);
    }

    @Override
    public int hashCode() {
        return color.length();
    }

    @Override
    public String toString() {
        return color + "dog";
    }
}
