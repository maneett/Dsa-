package recurrsion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }

     static void printTriangle(int[] a) {
         if(a.length == 1){
            return;
        }
        int[] temp = new int[a.length - 1];
         helper(temp,a,0);
         printTriangle(temp);
         System.out.println(Arrays.toString((temp)));
    }
    static int[] helper(int[] temp, int[] a, int index){
        if(a.length - 1 == index){
            return temp;
        }
        temp[index] = a[index] + a[index+1];
        return helper(temp,a,index+1);

    }
}
