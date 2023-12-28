package medium;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sum-equals-k/description/
public class SubArraySumEqualsK {
    public static void main(String[]args) {
        int[] nums = {1,1,1}; // 2
        int[] nums1 = {1,2,3}; // 2
        int[] nums2 = {1,-1,0}; // 3
        int[] nums3 = {100,1,2,3,4}; // 1
        int[] nums4 = {1,2,1,2,1}; // 4
        int[] nums5 = {-1,-1,1}; // 1
        int[] nums6 = {100,1,2,3,4}; // 2
        System.out.println(subarraySum(nums,2)); // 2
        System.out.println(subarraySum(nums1,3)); // 2
        System.out.println(subarraySum(nums2,0)); // 3
        System.out.println(subarraySum(nums3,6)); // 1
        System.out.println(subarraySum(nums4,3)); // 4
        System.out.println(subarraySum(nums5,0)); // 1
        System.out.println(subarraySum(nums6,3)); // 1
        System.out.println(subarraySum(new int[]{1},1)); // 1
        System.out.println(subarraySum(new int[]{0,0},0)); // 3
    }
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            if(map.containsKey(sum-k)) {
                ans = ans + map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
