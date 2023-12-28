package medium;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
public class KthLargestElement {
    public static void main(String[]args) {
        int[] array = {3,2,3,1,2,4,5,5,6};
        int[] arrayOne = {3,2,1,5,6,4};
        System.out.println(findKthLargest(array,4));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
