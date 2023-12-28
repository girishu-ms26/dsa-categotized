package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[]args) {
        int[] nums = {2,15,11,15,7};
        int target = 9;
        int[] res = twoSum(nums,target);
        Arrays.stream(res).forEach(System.out::println);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numToIndex  = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]),i};
            }
            numToIndex.put(nums[i],i);
        }
        return new int[]{};
    }
}
