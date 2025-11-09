package easy;

//https://leetcode.com/problems/missing-number

public class MissingNumber {
    public static void main(String[]args) {
        int[] array = {3,0,1};
        int[] arrayOne = {9,6,4,2,3,5,7,0,1};
        int[] arrayTwo = {0,1};
        int[] arrayThree = {1,0};
        int[] arrayFour = {0,2};
        System.out.println(missingNumber(arrayTwo));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];
        }
        return totalSum - sum;
    }
}
