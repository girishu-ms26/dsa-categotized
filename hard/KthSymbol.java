package hard;

//https://leetcode.com/problems/k-th-symbol-in-grammar/description/
public class KthSymbol {
    public static void main(String[]args) {
        System.out.println(kthGrammar(4,5));
    }

    private static int kthGrammar(int n, int k) {
        boolean areValuesSame = true;
        n = (int) Math.pow(2, n - 1);
        while (n != 1) {
            n /= 2;
            if (k > n) {
                k -= n;
                areValuesSame = !areValuesSame;
            }
        }
        return (areValuesSame ? 0 : 1);
    }
}
