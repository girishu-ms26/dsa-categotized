package easy;

// https://leetcode.com/problems/search-insert-position/
public class InsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        int aa = 5;
        System.out.println(searchInsert(a, aa));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
