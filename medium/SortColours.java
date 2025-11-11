package medium;

import java.util.Arrays;
import java.util.concurrent.Callable;

// https://leetcode.com/problems/sort-colors
public class SortColours {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        sortColors(array);
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(temp > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
