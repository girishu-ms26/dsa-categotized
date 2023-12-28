package easy;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[]args) {
        int[] arrayOne = {1,2,3,0,0,0};
        int[] arraytwo = {2,5,6};
        merge(arrayOne,3,arraytwo,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<nums1.length;i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println();
    }
}
