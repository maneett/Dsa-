package recurrsion;

import java.util.Arrays;

// bubble sort using recurrsion
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
         bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int l, int i){
        if(l == 0){
            return;
        }
        if(i < l){
            if(arr[i] > arr[i+1] ){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubble(arr,l,i+1);
        }else {
            bubble(arr,l-1,0);
        }
    }
}
