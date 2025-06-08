package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
public class LongestSubstring {
    public static void main(String[] args) {
        String a = "abcabcbb";
        String b = "bbbbb";
        String c = "pwwkew";
        String d = "aab";
        String e = "dvdf";
        System.out.println(lengthOfLongestSubstring(e));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int startingIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                startingIndex++;
                list.add(set.size());
                set.clear();
                i = startingIndex - 1;
            }
        }
        list.add(set.size());
        Collections.sort(list, Comparator.reverseOrder());
        return list.get(0);
    }
}
