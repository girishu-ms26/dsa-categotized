package patterns.prefixSum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/contiguous-array/
public class ContiguousArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] nums1 = {0,1,0,1};
        System.out.println(findMaxLength(nums1));
    }

    public static int findMaxLength(int[] nums) {
        int prefixLengthOne = 1;
        int prefixLengthTwo = 0;
        List<Integer> lengths = new ArrayList<>();
        int prefixValue = nums[0];
        int prefixIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                prefixLengthOne++;
                prefixValue = nums[i];
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (prefixValue != nums[j] && prefixLengthOne > prefixLengthTwo) {
                    prefixLengthTwo++;
                    if (j == nums.length - 1) {
                        prefixIndex++;
                        break;
                    }
                } else {
                    prefixIndex++;
                    break;
                }
            }

            if (prefixLengthOne == prefixLengthTwo) {
                lengths.add(prefixLengthOne + prefixLengthTwo);
            }
            prefixLengthOne = 1;
            prefixLengthTwo = 0;
            i = prefixIndex - 1;
        }
        return lengths.stream().sorted(Comparator.reverseOrder()).toList().get(0);
    }
}
