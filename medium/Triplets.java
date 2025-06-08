package medium;

import java.util.*;

// https://leetcode.com/problems/3sum/description/
public class Triplets {
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 2, -1, -4};
        int[] arr2 = {0, 1, 1};
        int[] arr3 = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        threeSum(arr1).stream().forEach(System.out::println);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
