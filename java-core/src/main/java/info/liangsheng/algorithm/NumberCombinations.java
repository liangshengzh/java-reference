package info.liangsheng.algorithm;

/**
 * Created by liangsheng on 9/21/14.
 */
public class NumberCombinations {
    public static void main(String[] args) {
        int[] number={1,2,3};
        int length = number.length;

        int[][] combos = new int[length][length];
        print(combos);
        for(int i =0;i<number.length;i++){
            System.out.println(number[i]);
            int m = i;
            int n =0;
            for(int j=0;j<combos.length && n<=i ;j++){
                if(m >= combos.length){
                    combos[j][n]=number[i];
                     n++;
                }else{
                    combos[j][m]=number[i];
                    m++;
                }
                print(combos);
                System.out.println("---------");

            }
        }
        print(combos);

    }
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }



}
