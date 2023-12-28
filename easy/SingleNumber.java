package easy;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[]args) {
        int[] array = {2,2,1};
        int[] arrayOne = {4,1,2,1,2};
        System.out.println(singleNumber(arrayOne));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
                continue;
            }
            hashMap.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
