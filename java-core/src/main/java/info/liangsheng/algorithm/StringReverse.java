package info.liangsheng.algorithm;

/**
 * Created by liangsheng on 9/11/14.
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "jimmy";

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println(reverse(str));


    }

    public static String reverse(String str){
        StringBuffer sb = new StringBuffer();
        for(int i =str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
       return sb.toString();
    }
}
