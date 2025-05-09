package easy;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Arrays.stream(sortedSquares(nums)).forEach(System.out::println);
    }

    private static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}