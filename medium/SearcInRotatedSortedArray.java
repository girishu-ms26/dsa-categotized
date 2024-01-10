package medium;

import java.util.Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=list&envId=xi4ci4ig
public class SearcInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }
    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
