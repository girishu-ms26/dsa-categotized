package medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
public class Anagrams {
    public static void main(String[]args) {
        String s = "abab";
        String p = "ab";
        findAnagrams(s,p).stream().forEach(System.out::println);
    }
    public static List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()>s.length()) {
            return result;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = map.size();
        int begin = 0,end = 0;
        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                map.put(c,map.get(c)-1);
                if(map.get(c) == 0) {
                    count -- ;
                }
            }
            end++;
            while (count == 0) {
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)) {
                    map.put(tempc,map.get(tempc) + 1);
                    if(map.get(tempc) > 0) {
                        count++;
                    }
                }
                if(end - begin == t.length()) {
                    result.add(begin);
                }
                begin++;
            }
        }
        return result;
    }
}
