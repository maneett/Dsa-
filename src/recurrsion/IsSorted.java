package recurrsion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr,i+1);
    }
}
