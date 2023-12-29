package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[]args) {
        Arrays.stream(twoSum(new int[]{2,7,11,15}, 9)).forEach(System.out::println); // [0,1]
        Arrays.stream(twoSum(new int[]{3,2,4}, 6)).forEach(System.out::println); // [1,2]
    }
   /* public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numToIndex  = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]),i};
            }
            numToIndex.put(nums[i],i);
        }
        return new int[]{};
    }*/

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
