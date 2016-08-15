package info.liangsheng.algorithm;

/**
 * Created by zhonlian on 2016/8/15.
 */
public class IntPaser {

    public static void main(String[] args) {
        System.out.println(parse("12345".toCharArray()));
    }

    public static int parse(char[] str){
        int result = 0;
        for(int i=0; i<str.length;i++){
            char c= str[i];
            result = result*10+ (c-'0');
        }
        return result;
    }
}
