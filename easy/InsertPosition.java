package easy;

// https://leetcode.com/problems/search-insert-position/
public class InsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 1, 1, 1, 1, 1, 1, 1,};
        int aa = 5;
        int[] b = {1, 3, 5, 6};
        int bb = 2;
        int[] c = {1, 3, 5, 6};
        int cc = 7;
        int[] d = {-1, 3, 5, 6};
        int dd = 0;
        System.out.println(searchInsert(d, dd));
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
