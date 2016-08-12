package info.liangsheng.algorithm.strings.contains;

/**
 * Created by zhonlian on 2016/8/12.
 * 给定两个分别由字母组成的字符串A和字符串B，字符串B的长度比字符串A短。请问，如何最快地判断字符串B中所有字母是否都在字符串A里？
 * <p/>
 * 为了简单起见，我们规定输入的字符串只包含大写英文字母，请实现函数bool StringContains(string &A, string &B)
 * <p/>
 * 比如，如果是下面两个字符串：
 * <p/>
 * String 1：ABCD
 * <p/>
 * String 2：BAD
 * <p/>
 * 答案是true，即String2里的字母在String1里也都有，或者说String2是String1的真子集。
 * <p/>
 * 如果是下面两个字符串：
 * <p/>
 * String 1：ABCD
 * <p/>
 * String 2：BCE
 * <p/>
 * 答案是false，因为字符串String2里的E字母不在字符串String1里。
 * <p/>
 * 同时，如果string1：ABCD，string 2：AA，同样返回true。
 */
public class AContainsB {


    public static void main(String[] args) {
        String a = "ABCD";
        String b = "AABE";
        System.out.println(contains(a, b));
        System.out.println(contains(a.toCharArray(), b.toCharArray()));
    }

    public static boolean contains(String a, String b){
        if(a == null|| b == null || a.length()< b.length()){
            return  false;
        }
        boolean  result = true;
        for(char c :b.toCharArray()){
            if(!a.contains(Character.toString(c))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean contains(char[] a, char[] b){
        if(a == null || b == null || a.length < b.length){
            return false;
        }
        for(char bc: b){
            boolean contain = false;
            for(char ac: a){
                if(ac == bc){
                    contain = true;
                    break;
                }
            }
            if(!contain){
                return false;
            }
        }
        return true;
    }
}

