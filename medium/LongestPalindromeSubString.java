package medium;

//https://leetcode.com/problems/longest-palindromic-substring/?envType=list&envId=xi4ci4ig
public class LongestPalindromeSubString {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("babad")); // bab
//        System.out.println(longestPalindrome("cbbd")); // bb
//        System.out.println(longestPalindrome("a")); // a
//        System.out.println(longestPalindrome("ac")); // a
//        System.out.println(longestPalindrome("bb")); // bb
//        System.out.println(longestPalindrome("abb")); // bb
        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")); // bb
    }
    /*public static String longestPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        if(s.length()==1) {
            return s;
        }
        if(s.equals(builder.append(s).reverse().toString())) {
            return s;
        }
        Map<String,Integer> map = new LinkedHashMap<>();
        String temp = "";
        int right = 0;
        builder = new StringBuilder();
        for(int left=0;left<s.length();left++) {
            for(right=right+1;right<s.length();right++) {
                temp = s.substring(left,right+1);
                builder.append(temp);
                if(temp.equals(builder.reverse().toString())) {
                    if(!map.containsKey(temp)) {
                        map.put(temp,temp.length());
                    }
                }
                builder = new StringBuilder();
            }
            right = left+1;
        }
        try {
            return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        } catch (Exception e) {
            return s.substring(0,1);
        }
    }*/
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
