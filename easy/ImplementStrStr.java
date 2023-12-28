package easy;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/
public class ImplementStrStr {
    public static void main(String[]args){
        final String A = "b";
        final String B = "b";
        System.out.println(strStr(A,B));
    }

    public static int strStr(final String A, final String B) {
        int ans  = -1;
        String C = "";
        for(int i=0;i<=A.length()-B.length();i++){
            C = A.substring(i,i+B.length());
            if(B.equals(C)){
                ans =  i;
                break;
            }
        }
        return ans;
    }
}
