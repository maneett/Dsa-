package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp ;
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(j,j-1,arr);
                }else{
                    break;
                }
            }
            
        }
    }
}
