package easy;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 0, 0, 0};
        int[] arraytwo = {2, 5, 6};
        merge(arrayOne, 3, arraytwo, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            temp = nums1[i];
            for (int j = i + 1; j < nums1.length; j++) {
                if (temp > nums1[j]) {
                    temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }
        }
    }
}
