package info.liangsheng.algorithm.sort;

/**
 * Created by zhonlian on 2016/8/15.
 */
public class QuickSort {

    private static  int[] arr = new int[]{4,23,56,2,52,02,43,29};
    private static  String str = "BDAEKA";

    public static void main(String[] args) {
        println(arr);
        sort(arr,0,arr.length-1);
        println(arr);
        char[] strarr = str.toCharArray();
        sort(strarr, 0, str.length()-1);
        System.out.println(strarr);
    }

    public static void sort(int[] arr,int left, int right){
        if(right-left <=1){
            return;
        }
        int pivot = right;
        int index = left;
        for(int i = left; i< right; i++){
            if(arr[i]<= arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[right];
        arr[right] =temp;

        sort(arr,left,index -1);
        sort(arr, index +1, right);
    }

    public static void sort(char[] arr, int left, int right){
        if(right-left <=1){
            return;
        }
        int pivot = right;
        int index = left;
        for(int i = left; i< right; i++){
            if(arr[i]<= arr[pivot]){
                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        char temp = arr[index];
        arr[index] = arr[right];
        arr[right] =temp;

        sort(arr,left,index -1);
        sort(arr, index +1, right);
    }




    public static void println(int[] arr){
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }





}
