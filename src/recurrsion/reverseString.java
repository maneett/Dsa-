package recurrsion;

public class reverseString {
    public static String reverseString(String s) {
        int length = s.length();
        if (length <= 1) return s;
        String leftStr = s.substring(0, length / 2);
        String rightStr = s.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
