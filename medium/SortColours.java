package medium;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors
public class SortColours {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        sortColors(array);
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int k = i + 1; k < nums.length; k++) {
                if(temp > nums[k]) {
                    temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
