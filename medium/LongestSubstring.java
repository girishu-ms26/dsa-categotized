package medium;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
public class LongestSubstring {
    public static void main(String[]args) {
        String a = "abcabcbb";
        String b = "bbbbb";
        String c = "pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int right=0; right<n;right++) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength,right-left+1);
            } else {
                while(s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
