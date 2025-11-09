package easy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arrayOne = {3, 2, 3};
        int[] arrayTwo = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arrayOne));
    }

    public static int majorityElement(int[] nums) {
        int times = nums.length / 2;
        Map<Integer, Long> map = Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return map.entrySet().stream().filter(kv -> kv.getValue() > times).findFirst().get().getKey();
    }
}
