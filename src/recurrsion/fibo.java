package recurrsion;

public class fibo {
    static int fibo(int n){
        // base case
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
}
// TC -> O(golden ratio) power n
//    ->  O(2 power n) which is exponetial  this is wrong.