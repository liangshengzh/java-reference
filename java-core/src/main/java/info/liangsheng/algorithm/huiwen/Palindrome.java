package info.liangsheng.algorithm.huiwen;

/**
 * Created by zhonlian on 2016/8/15.
 */
public class Palindrome {

    public static void main(String[] args) {
        String str = "123454321";
        System.out.println(isPalindrome(str.toCharArray()));


    }


    public static boolean isPalindrome(char[] str){
        int begin = 0;
        int end = str.length -1;
        while (begin < end){
            if(str[begin] != str[end] ){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }


}
