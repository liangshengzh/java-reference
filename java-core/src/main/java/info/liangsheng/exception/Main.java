package info.liangsheng.exception;

/**
 * Created by zhong on 8/1/16.
 *
 * 问: try {}里有一个return语句，那么紧跟在这个try后的finally {}里的code会不会被执行，什么时候被执行，还是在return之后执行？
 * 答: 会在return的中间执行
 * 在try中执行到return语句时, 要返回的结果已经准备好了, 但是此时会转到finally执行.
 * 在转去之前, 先用另外一个局部变量保存返回结果. 等到finally执行完后再从局部变量里面
 * 取出返回结果.
 * 所以即使finally中对 x进行了改变, 也不会影响返回结果.

 */
public class Main {

    public static void main(String[] args) {

        System.out.println(test());

        while(true){
            new Object();
        }
    }

    static int test()
    {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            x = x + 1;
        }
    }
}
