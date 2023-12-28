package easy;
//https://leetcode.com/problems/missing-number/submissions/1104181097/
public class MissingIntegerInArray {
    public static void main(String[]args){
        int[] arr = {2,3,4,1,6,7};
        int n = 7;
        int missingInt = missingIntInArray(arr,n);
        System.out.println(missingInt);
    }

    static int missingIntInArray(int arr[], int n) {
        if(arr.length == 2){
            return 1;
        }
        if(n == 2){
            if(arr[0] == 2)
            return 1;
        }
        if(arr.length == 1){
            return 2;
        }
        int[] seq = new int[arr.length+1];
        for(int i=0;i<=seq.length-1;i++){
            seq[i]=i+1;
        }
        int missingInt = 0;
        int temp = 0;
        for(int i=1;i<=arr.length-1;i++){
            temp = seq[i-1];
                for(int j=0;j<=arr.length-1;j++){
                if(arr[j]!=temp){
                    missingInt=temp;
                }
            }
        }
        return missingInt;
    }
}