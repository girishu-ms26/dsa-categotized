package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[]args) {
        int[] arr1 = {-1,0,1,2,-1,-4};
        int[] arr2 = {0,1,1};
        int[] arr3 = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        threeSum(arr1).stream().forEach(System.out::println); // [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> triplets = new ArrayList<>();
        if(Arrays.stream(nums).filter(n -> n==0).count() == nums.length) {
            triplets.add(Arrays.asList(0,0,0));
            return triplets;
        }
        Arrays.sort(nums); // O(N)
        int sum = 0;
        for(int i=0;i<nums.length;i++) { // O(N)
            int left = i+1;
            int right = nums.length-1;
            while(left < right) { // O(N)
                sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    triplets.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets.stream().distinct().collect(Collectors.toList());
    }
}
