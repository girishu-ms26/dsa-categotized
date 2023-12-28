package easy;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class DuplicateNumber {
    public static void main(String[]args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        return Arrays.stream(nums).parallel().filter(i -> !hashSet.add(i)).findFirst().getAsInt();
    }
}
