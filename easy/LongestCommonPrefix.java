package easy;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public static void main(String[]args){
        ArrayList<String> A = new ArrayList<>();
        /*A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");*/
        A.add("ab");
        A.add("a");
        System.out.println(longestCommonPrefix(A));
    }

    public static String longestCommonPrefix(ArrayList<String> A) {
        if(A==null || A.size()==0){
            return "";
        }
        if(A.size()==1){
            return A.get(0);
        }
        Collections.sort(A);
        String first = A.get(0);
        String last = A.get(A.size()-1);
        int count = 0;
        while(count<first.length() && first.charAt(count) == last.charAt(count)){
            count++;
        }
        return first.substring(0,count);
    }
}
