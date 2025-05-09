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
        HashSet<Integer> hashSet = new HashSet<>();
        Arrays.stream(nums).forEach(n -> hashSet.add(n));
        List<Integer> numbers = new ArrayList<>(hashSet);
        Collections.sort(numbers);
        for(int i=0;i<nums.length;i++) {
            if(i < numbers.size()) {
                nums[i] = numbers.get(i);
            }
        }
        return hashSet.size();
    }
}
