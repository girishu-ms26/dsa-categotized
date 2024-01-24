package easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("Hello World"));
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a "));
    }
    public static int lengthOfLastWord(String s) {
        if(s.length()==1) {
            return s.length();
        }
        String s1 = "";
        int count = 0;
        for(int i=s.length()-1;i>0;i--) {
            if(s.charAt(i) == ' '){
                count++;
            } else {
                 break;
            }
        }
        for(int i=s.length()-count-1;i>=0;i--) {
            if(s.charAt(i) != ' '){
                s1 = s1 + s.charAt(i);
            } else {
                break;
            }
        }
        return s1.length();
    }
}
