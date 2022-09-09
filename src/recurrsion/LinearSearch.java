package recurrsion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,0,3,5,33,5,0,23,45,67};
        System.out.println(linearSearch(arr,33,0));
    }
    static int linearSearch(int[] arr,int t, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        return linearSearch(arr,t,i+1);
    }
}
