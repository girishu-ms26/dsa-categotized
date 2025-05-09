package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[]args) {
        int[] arrayOne = {3,2,3};
        int[] arrayTwo = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arrayOne));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int n = (nums.length/2);
        for(int i=0;i<nums.length;i++) {
            if(!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i],1);
            } else {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
