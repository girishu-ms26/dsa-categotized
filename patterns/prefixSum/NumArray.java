package patterns.prefixSum;

// https://leetcode.com/problems/range-sum-query-immutable/description/
public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum = sum + this.nums[i];
        }

        return sum;
    }
}
