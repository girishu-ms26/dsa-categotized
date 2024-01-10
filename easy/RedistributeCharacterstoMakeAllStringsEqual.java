package easy;

import java.util.*;

//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
public class RedistributeCharacterstoMakeAllStringsEqual {
    public static void main(String[] args) {
//        System.out.println(makeEqual(new String[]{"abc","aabc","bc"})); // true
//        System.out.println(makeEqual(new String[]{"ab","a"})); // false
//        System.out.println(makeEqual(new String[]{"a","b"})); // false
//        System.out.println(makeEqual(new String[]{"a","a","a"})); // true
//        System.out.println(makeEqual(new String[]{"bc","de"})); // false
        System.out.println(makeEqual(new String[]{"caaaaa","aaaaaaaaa",
                "a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc",
                "ccccccc","ccccccc","cc","cccc","c","cccccccc","c"})); // true
    }
    public static boolean makeEqual(String[] words) {
        if(words.length == 1) {
            return true;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words[i].length();j++) {
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);
            }
        }

        for(Map.Entry<Character,Integer> key : map.entrySet()) {
            if(key.getValue() % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
