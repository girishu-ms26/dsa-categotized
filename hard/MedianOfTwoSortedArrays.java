package hard;

import java.util.Arrays;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianOfTwoSortedArrays {
    public static void main(String[]args) {
        int[] arrayOne = {1,3};
        int[] arrayTwo = {2};
        System.out.println(findMedianSortedArrays(arrayOne,arrayTwo));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArray = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        Arrays.sort(combinedArray);
        if(combinedArray.length % 2 == 0) {
           return new Double(combinedArray[combinedArray.length/2-1]    + combinedArray[combinedArray.length/2]) / 2;
        }
        return combinedArray[combinedArray.length/2];
    }
}
