package medium;

// https://leetcode.com/problems/sort-colors/submissions/1105946397/
public class SortColours {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
    }

    public static void sortColors(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
