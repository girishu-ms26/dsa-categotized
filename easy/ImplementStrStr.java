package easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/
public class ImplementStrStr {
    public static void main(String[] args) {
        final String A = "abc";
        final String B = "c";
        System.out.println(strStr(A, B));
    }

    public static int strStr(String haystack, String needle) {
        int ans = -1;
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.length() + i < haystack.length() + 1) {
                String sub = haystack.substring(i, needle.length() + i);
                if (sub.equals(needle)) {
                    return i;
                }
            } else {
                break;
            }
        }
        return ans;
    }
}
