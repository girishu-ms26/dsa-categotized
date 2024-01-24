package medium;

public class ReverseInteger {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
//        System.out.println(reverse(-123));
//        System.out.println(reverse(120));
//        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        if(x < 0) {
            stringBuilder.append(String.valueOf(x).substring(1));
            stringBuilder.reverse();
            return -Integer.parseInt(stringBuilder.toString());
        }
        stringBuilder.append(x);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}
