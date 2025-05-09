package medium;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] a = {5, 7, 7, 8, 8, 10}; // 3, 4
        int[] b = {5, 7, 7, 8, 8, 10}; // -1, -1
        int[] c = {}; // -1 , -1
        int[] d = {2, 2}; // 0 , 1
        int[] e = {1, 4}; // 1, 1
        int[] f = {1, 2, 3}; // 1,1
        int[] res = searchRange(d, 2);
        Arrays.stream(res).forEach(System.out::print);
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
