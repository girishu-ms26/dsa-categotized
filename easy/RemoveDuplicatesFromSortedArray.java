package easy;

import java.util.*;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[]args) {
        int[] arrayOne = {0,0,1,1,1,2,2,3,3,4};
        int[] arrayTWo = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(arrayTWo));
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> withoutDuplicates = new HashSet<>();
        Arrays.stream(nums).forEach(i -> withoutDuplicates.add(i));
        List<Integer> integers = new ArrayList<>(withoutDuplicates);
        Collections.sort(integers);
        for(int i=0;i<nums.length;i++) {
            if(i < integers.size())
            nums[i] = integers.get(i);
        }
        return withoutDuplicates.size();
    }
}
