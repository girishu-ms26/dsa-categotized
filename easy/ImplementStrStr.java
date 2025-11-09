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
        String c = "";
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            c = haystack.substring(i, i + needle.length());
            if(c.equals(needle)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
